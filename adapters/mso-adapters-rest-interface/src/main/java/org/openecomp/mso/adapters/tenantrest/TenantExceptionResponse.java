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

package org.openecomp.mso.adapters.tenantrest;



import org.openecomp.mso.openstack.exceptions.MsoExceptionCategory;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import org.jboss.resteasy.annotations.providers.NoJackson;

@XmlRootElement(name = "createTenantResponse")
@NoJackson
public class TenantExceptionResponse implements Serializable {

    private static final long serialVersionUID = -9062290006520066109L;

    private String message;
	private MsoExceptionCategory category;
	private Boolean rolledBack;

	public TenantExceptionResponse () {}

	public TenantExceptionResponse (String message) {
		this.message = message;
	}

	public TenantExceptionResponse (String message, MsoExceptionCategory category, boolean rolledBack) {
		this.message = message;
		this.category = category;
		this.rolledBack = rolledBack;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MsoExceptionCategory getCategory () {
		return category;
	}

	public void setCategory (MsoExceptionCategory category) {
		this.category = category;
	}

	public Boolean getRolledBack() {
		return rolledBack;
	}

	public void setRolledBack(Boolean rolledBack) {
		this.rolledBack = rolledBack;
	}
	
}
