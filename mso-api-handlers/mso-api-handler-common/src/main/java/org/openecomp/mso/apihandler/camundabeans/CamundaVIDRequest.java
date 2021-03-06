/*-
 * ============LICENSE_START=======================================================
 * OPENECOMP - MSO
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.openecomp.mso.apihandler.camundabeans;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import org.openecomp.mso.apihandler.common.CommonConstants;

/**
 * JavaBean JSON class for a "variables" which contains the JSON payload that
 * will be passed to the Camunda process
 */
@JsonPropertyOrder({CommonConstants.CAMUNDA_SERVICE_INPUT, CommonConstants.REQUEST_ID_VARIABLE,
	CommonConstants.REQUEST_ID_HEADER,
	CommonConstants.IS_BASE_VF_MODULE_VARIABLE, CommonConstants.RECIPE_TIMEOUT_VARIABLE,
	CommonConstants.REQUEST_ACTION_VARIABLE, CommonConstants.SERVICE_INSTANCE_ID_VARIABLE,
	CommonConstants.VNF_ID_VARIABLE, CommonConstants.VF_MODULE_ID_VARIABLE,
	CommonConstants.VOLUME_GROUP_ID_VARIABLE, CommonConstants.NETWORK_ID_VARIABLE,
	CommonConstants.SERVICE_TYPE_VARIABLE, CommonConstants.VNF_TYPE_VARIABLE,
	CommonConstants.VF_MODULE_TYPE_VARIABLE, CommonConstants.NETWORK_TYPE_VARIABLE,
	CommonConstants.CAMUNDA_SERVICE_INPUT})
@JsonRootName(CommonConstants.CAMUNDA_ROOT_INPUT)
public class CamundaVIDRequest {

	@JsonProperty(CommonConstants.CAMUNDA_SERVICE_INPUT)
	private CamundaInput serviceInput;

	@JsonProperty(CommonConstants.CAMUNDA_HOST)
	private CamundaInput host;

	@JsonProperty(CommonConstants.REQUEST_ID_VARIABLE)
	private CamundaInput requestId;

	@JsonProperty(CommonConstants.REQUEST_ID_HEADER)
	private CamundaInput msoRequestId;


	@JsonProperty(CommonConstants.IS_BASE_VF_MODULE_VARIABLE)
	private CamundaBooleanInput isBaseVfModule;

	@JsonProperty(CommonConstants.RECIPE_TIMEOUT_VARIABLE)
	private CamundaIntegerInput recipeTimeout;

	@JsonProperty(CommonConstants.REQUEST_ACTION_VARIABLE)
	private CamundaInput requestAction;

	@JsonProperty(CommonConstants.SERVICE_INSTANCE_ID_VARIABLE)
	private CamundaInput serviceInstanceId;

	@JsonProperty(CommonConstants.VNF_ID_VARIABLE)
	private CamundaInput vnfId;

	@JsonProperty(CommonConstants.VF_MODULE_ID_VARIABLE)
	private CamundaInput vfModuleId;

	@JsonProperty(CommonConstants.VOLUME_GROUP_ID_VARIABLE)
	private CamundaInput volumeGroupId;

	@JsonProperty(CommonConstants.NETWORK_ID_VARIABLE)
	private CamundaInput networkId;

	@JsonProperty(CommonConstants.SERVICE_TYPE_VARIABLE)
	private CamundaInput serviceType;

	@JsonProperty(CommonConstants.VNF_TYPE_VARIABLE)
	private CamundaInput vnfType;

	@JsonProperty(CommonConstants.VF_MODULE_TYPE_VARIABLE)
	private CamundaInput vfModuleType;

	@JsonProperty(CommonConstants.NETWORK_TYPE_VARIABLE)
	private CamundaInput networkType;

	@JsonProperty(CommonConstants.CAMUNDA_SERVICE_INPUT)
	public CamundaInput getServiceInput() {
		return serviceInput;
	}

	@JsonProperty(CommonConstants.CAMUNDA_SERVICE_INPUT)
	public void setServiceInput(CamundaInput serviceInput) {
		this.serviceInput = serviceInput;
	}

	@JsonProperty(CommonConstants.CAMUNDA_HOST)
	public CamundaInput getHost() {
		return host;
	}

	@JsonProperty(CommonConstants.CAMUNDA_HOST)
	public void setHost(CamundaInput host) {
		this.host = host;
	}

	@JsonProperty(CommonConstants.REQUEST_ID_VARIABLE)
	public CamundaInput getRequestId() {
		return requestId;
	}

	@JsonProperty(CommonConstants.REQUEST_ID_VARIABLE)
	public void setRequestId(CamundaInput requestId) {
		this.requestId = requestId;
	}

	@JsonProperty(CommonConstants.REQUEST_ID_HEADER)
	public CamundaInput getMsoRequestId() {
		return msoRequestId;
	}

	@JsonProperty(CommonConstants.REQUEST_ID_HEADER)
	public void setMsoRequestId(CamundaInput msoRequestIdp) {
		this.msoRequestId = msoRequestIdp;
	}

	@JsonProperty(CommonConstants.IS_BASE_VF_MODULE_VARIABLE)
	public CamundaBooleanInput getIsBaseVfModule() {
		return isBaseVfModule;
	}

	@JsonProperty(CommonConstants.IS_BASE_VF_MODULE_VARIABLE)
	public void setIsBaseVfModule(CamundaBooleanInput isBaseVfModule) {
		this.isBaseVfModule = isBaseVfModule;
	}

	@JsonProperty(CommonConstants.RECIPE_TIMEOUT_VARIABLE)
	public CamundaIntegerInput getRecipeTimeout() {
		return recipeTimeout;
	}

	@JsonProperty(CommonConstants.RECIPE_TIMEOUT_VARIABLE)
	public void setRecipeTimeout(CamundaIntegerInput recipeTimeout) {
		this.recipeTimeout = recipeTimeout;
	}

	@JsonProperty(CommonConstants.REQUEST_ACTION_VARIABLE)
	public CamundaInput getRequestAction() {
		return requestAction;
	}

	@JsonProperty(CommonConstants.REQUEST_ACTION_VARIABLE)
	public void setRequestAction(CamundaInput requestAction) {
		this.requestAction = requestAction;
	}
	@JsonProperty(CommonConstants.SERVICE_INSTANCE_ID_VARIABLE)
	public CamundaInput getServiceInstanceId() {
		return serviceInstanceId;
	}

	@JsonProperty(CommonConstants.SERVICE_INSTANCE_ID_VARIABLE)
	public void setServiceInstanceId(CamundaInput serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
	}

	@JsonProperty(CommonConstants.VNF_ID_VARIABLE)
	public CamundaInput getVnfId() {
		return vnfId;
	}

	@JsonProperty(CommonConstants.VNF_ID_VARIABLE)
	public void setVnfId(CamundaInput vnfId) {
		this.vnfId = vnfId;
	}

	@JsonProperty(CommonConstants.VF_MODULE_ID_VARIABLE)
	public CamundaInput getVfModuleId() {
		return vfModuleId;
	}

	@JsonProperty(CommonConstants.VF_MODULE_ID_VARIABLE)
	public void setVfModuleId(CamundaInput vfModuleId) {
		this.vfModuleId = vfModuleId;
	}

	@JsonProperty(CommonConstants.VOLUME_GROUP_ID_VARIABLE)
	public CamundaInput getVolumeGroupId() {
		return volumeGroupId;
	}

	@JsonProperty(CommonConstants.VOLUME_GROUP_ID_VARIABLE)
	public void setVolumeGroupId(CamundaInput volumeGroupId) {
		this.volumeGroupId = volumeGroupId;
	}

	@JsonProperty(CommonConstants.NETWORK_ID_VARIABLE)
	public CamundaInput getNetworkId() {
		return networkId;
	}

	@JsonProperty(CommonConstants.NETWORK_ID_VARIABLE)
	public void setNetworkId(CamundaInput networkId) {
		this.networkId = networkId;
	}

	@JsonProperty(CommonConstants.SERVICE_TYPE_VARIABLE)
	public CamundaInput getServiceType() {
		return serviceType;
	}

	@JsonProperty(CommonConstants.SERVICE_TYPE_VARIABLE)
	public void setServiceType(CamundaInput serviceType) {
		this.serviceType = serviceType;
	}

	@JsonProperty(CommonConstants.VNF_TYPE_VARIABLE)
	public CamundaInput getVnfType() {
		return vnfType;
	}

	@JsonProperty(CommonConstants.VNF_TYPE_VARIABLE)
	public void setVnfType(CamundaInput vnfType) {
		this.vnfType = vnfType;
	}

	@JsonProperty(CommonConstants.VF_MODULE_TYPE_VARIABLE)
	public CamundaInput getVfModuleType() {
		return vfModuleType;
	}

	@JsonProperty(CommonConstants.VF_MODULE_TYPE_VARIABLE)
	public void setVfModuleType(CamundaInput vfModuleType) {
		this.vfModuleType = vfModuleType;
	}

	@JsonProperty(CommonConstants.NETWORK_TYPE_VARIABLE)
	public CamundaInput getNetworkType() {
		return networkType;
	}

	@JsonProperty(CommonConstants.NETWORK_TYPE_VARIABLE)
	public void setNetworkType(CamundaInput networkType) {
		this.networkType = networkType;
	}


	@Override
	public String toString() {
		//return "CamundaRequest [requestId=" +  + ", host="
		//		+ host + ", schema=" + schema + ", reqid=" + reqid + ", svcid="
			//	+ svcid + ", timeout=" + timeout + "]";
		return "CamundaRequest";
	}

}
