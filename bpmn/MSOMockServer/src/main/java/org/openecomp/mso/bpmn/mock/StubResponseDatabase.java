/*
 * © 2014 AT&T Intellectual Property. All rights reserved. Used under license from AT&T Intellectual Property.
 */
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

package org.openecomp.mso.bpmn.mock;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;

/**
 * Stub response class for Database stubs
 * including database adapter, catalog db,
 * and other databases.
 */
public class StubResponseDatabase {

	public static void setupAllMocks() {

	}

	public static void mockUpdateRequestDB(int statusCode, String reponseFile) {
		stubFor(post(urlEqualTo("/dbadapters/RequestsDbAdapter"))
				.willReturn(aResponse()
				.withStatus(statusCode)
			    .withHeader("Content-Type", "text/xml")
				.withBodyFile(reponseFile)));
	}

	public static void MockGetAllottedResourcesByModelInvariantId(String modelInvariantId, String responseFile){
		stubFor(get(urlEqualTo("/v1/serviceAllottedResources?serviceModelInvariantUuid=" + modelInvariantId))
				.willReturn(aResponse()
				.withStatus(200)
			    .withHeader("Content-Type", "application/json")
				.withBodyFile(responseFile)));
	}

	public static void MockGetAllottedResourcesByModelInvariantId_500(String modelInvariantId, String responseFile){
		stubFor(get(urlEqualTo("/v1/serviceAllottedResources?serviceModelInvariantUuid=" + modelInvariantId))
				.willReturn(aResponse()
				.withStatus(500)));
	}

}
