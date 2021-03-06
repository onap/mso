package org.openecomp.mso.global_tests.asdc.notif_emulator;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.openecomp.sdc.api.IDistributionClient;
import org.openecomp.sdc.api.consumer.IConfiguration;
import org.openecomp.sdc.api.consumer.IDistributionStatusMessage;
import org.openecomp.sdc.api.consumer.INotificationCallback;
import org.openecomp.sdc.api.notification.IArtifactInfo;
import org.openecomp.sdc.api.notification.IVfModuleMetadata;
import org.openecomp.mso.asdc.installer.IVfModuleData;
import org.openecomp.mso.asdc.installer.VfModuleMetaData;
import org.openecomp.mso.asdc.client.ASDCConfiguration;
import org.openecomp.sdc.api.results.IDistributionClientDownloadResult;
import org.openecomp.sdc.api.results.IDistributionClientResult;
import org.openecomp.sdc.impl.DistributionClientDownloadResultImpl;
import org.openecomp.sdc.impl.DistributionClientResultImpl;
import org.openecomp.sdc.utils.DistributionActionResultEnum;

public class DistributionClientEmulator implements IDistributionClient {

	private String resourcePath;

	private List<IVfModuleData> listVFModuleMetaData;

	private List<IDistributionStatusMessage> distributionMessageReceived = new LinkedList<>();

	public DistributionClientEmulator(String notifFolderInResource) {

		resourcePath = notifFolderInResource;
	}

	public List<IDistributionStatusMessage> getDistributionMessageReceived() {
		return distributionMessageReceived;
	}
	@Deprecated
	public List<IVfModuleMetadata> decodeVfModuleArtifact(byte[] arg0) {


		return null;
	}

	public List<IVfModuleData> getListVFModuleMetaData() {
		return listVFModuleMetaData;
	}

    @Override
	public IDistributionClientDownloadResult download (IArtifactInfo arg0) {

		//String filename = resourcePath+"/artifacts/"+arg0.getArtifactURL();
		String filename = arg0.getArtifactURL();
		System.out.println("Emulating the download from resources files:"+filename);
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath+"/artifacts/"+filename);

		if (inputStream == null) {
			System.out.println("InputStream is NULL for:"+filename);
		}
		try {
			byte[] bytes = IOUtils.toByteArray(inputStream);
			if (arg0.getArtifactType().equals(ASDCConfiguration.VF_MODULES_METADATA)) {
				listVFModuleMetaData = new ObjectMapper().readValue(bytes, new TypeReference<List<VfModuleMetaData>>() {
				});
			}
			return new DistributionClientDownloadResultImpl(DistributionActionResultEnum.SUCCESS, DistributionActionResultEnum.SUCCESS.name(),arg0.getArtifactName(),bytes);
		} catch (IOException e) {
				return null;
		}
	}

	@Override
	public IConfiguration getConfiguration() {
		return null;
	}

	@Override
	public IDistributionClientResult init(IConfiguration arg0, INotificationCallback arg1) {
		return new DistributionClientResultImpl(DistributionActionResultEnum.SUCCESS,DistributionActionResultEnum.SUCCESS.name());
	}

	@Override
	public IDistributionClientResult sendDeploymentStatus(IDistributionStatusMessage arg0) {
		this.distributionMessageReceived.add(arg0);
		return new DistributionClientResultImpl(DistributionActionResultEnum.SUCCESS,DistributionActionResultEnum.SUCCESS.name());
	}

	@Override
	public IDistributionClientResult sendDeploymentStatus(IDistributionStatusMessage arg0, String arg1) {
		this.distributionMessageReceived.add(arg0);
		return new DistributionClientResultImpl(DistributionActionResultEnum.SUCCESS,DistributionActionResultEnum.SUCCESS.name());
	}

	@Override
	public IDistributionClientResult sendDownloadStatus(IDistributionStatusMessage arg0) {
		this.distributionMessageReceived.add(arg0);
		return new DistributionClientResultImpl(DistributionActionResultEnum.SUCCESS,DistributionActionResultEnum.SUCCESS.name());
	}

	@Override
	public IDistributionClientResult sendDownloadStatus(IDistributionStatusMessage arg0, String arg1) {
		this.distributionMessageReceived.add(arg0);
		return new DistributionClientResultImpl(DistributionActionResultEnum.SUCCESS,DistributionActionResultEnum.SUCCESS.name());
	}

	@Override
	public IDistributionClientResult start() {
		return new DistributionClientResultImpl(DistributionActionResultEnum.SUCCESS,DistributionActionResultEnum.SUCCESS.name());
	}

	@Override
	public IDistributionClientResult stop() {
		return new DistributionClientResultImpl(DistributionActionResultEnum.SUCCESS,DistributionActionResultEnum.SUCCESS.name());

	}

	@Override
	public IDistributionClientResult updateConfiguration(IConfiguration arg0) {
		return new DistributionClientResultImpl(DistributionActionResultEnum.SUCCESS,DistributionActionResultEnum.SUCCESS.name());
	}

}
