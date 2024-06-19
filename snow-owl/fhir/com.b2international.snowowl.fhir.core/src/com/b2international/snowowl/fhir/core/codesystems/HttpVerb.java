/*
 * Copyright 2021 B2i Healthcare, https://b2ihealthcare.com
 * 
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
 */
package com.b2international.snowowl.fhir.core.codesystems;

import com.b2international.snowowl.fhir.core.ResourceNarrative;

/**
 * FHIR Http verb code system
 * @since 8.0.0
 *
 */
@ResourceNarrative("HTTP verbs (in the HTTP command line). See HTTP rfc  for details.")
public enum HttpVerb implements FhirCodeSystem {
	
	GET,
	HEAD,
	POST,
	PUT,
	DELETE,
	PATCH;
	
	public final static String CODE_SYSTEM_URI = "http://hl7.org/fhir/http-verb";

	public String getDisplayName() {
		return name();
	}
	
	@Override
	public String getCodeValue() {
		return name();
	}
	
	@Override
	public String getCodeSystemUri() {
		return CODE_SYSTEM_URI;
	}
	
}
