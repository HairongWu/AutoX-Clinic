/*
 * Copyright 2017-2021 B2i Healthcare, https://b2ihealthcare.com
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
package com.b2international.snowowl.snomed.datastore.request;

import com.b2international.snowowl.core.authorization.AccessControl;
import com.b2international.snowowl.core.domain.BranchContext;
import com.b2international.snowowl.core.identity.Permission;
import com.b2international.snowowl.core.request.GetResourceRequest;
import com.b2international.snowowl.snomed.core.domain.SnomedConcept;
import com.b2international.snowowl.snomed.core.domain.SnomedConcepts;

/**
 * @since 5.7
 */
final class SnomedConceptGetRequest 
		extends GetResourceRequest<SnomedConceptSearchRequestBuilder, BranchContext, SnomedConcepts, SnomedConcept>
		implements AccessControl {

	private static final long serialVersionUID = 1L;
	
	SnomedConceptGetRequest(String conceptId) {
		super(conceptId);
	}

	@Override
	protected SnomedConceptSearchRequestBuilder createSearchRequestBuilder() {
		return new SnomedConceptSearchRequestBuilder();
	}
	
	@Override
	public String getOperation() {
		return Permission.OPERATION_BROWSE;
	}

}
