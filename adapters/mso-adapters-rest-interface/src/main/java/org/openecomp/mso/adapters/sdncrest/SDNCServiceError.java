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
package org.openecomp.mso.adapters.sdncrest;

import org.codehaus.jackson.map.annotate.JsonRootName;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.jboss.resteasy.annotations.providers.NoJackson;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

// NOTE: the JAXB (XML) annotations are required with JBoss AS7 and RESTEasy,
//       even though we are using JSON exclusively.  The @NoJackson annotation
//       is also required in this environment.

/**
 * SDNC adapter error response for "agnostic" API services.
 */
@JsonRootName("SDNCServiceError")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@XmlRootElement(name = "SDNCServiceError")
@NoJackson
public class SDNCServiceError extends SDNCErrorCommon implements Serializable {
	private static final long serialVersionUID = 1;

	public SDNCServiceError(String sdncRequestId, String responseCode,
			String responseMessage, String ackFinalIndicator) {
		super(sdncRequestId, responseCode, responseMessage, ackFinalIndicator);
	}

	public SDNCServiceError() {
	}
}