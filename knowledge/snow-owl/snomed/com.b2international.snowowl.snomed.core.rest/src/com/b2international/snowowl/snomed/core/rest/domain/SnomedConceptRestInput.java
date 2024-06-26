/*
 * Copyright 2011-2024 B2i Healthcare, https://b2ihealthcare.com
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
package com.b2international.snowowl.snomed.core.rest.domain;

import java.util.Collections;
import java.util.List;

import com.b2international.snowowl.snomed.common.SnomedConstants.Concepts;
import com.b2international.snowowl.snomed.datastore.request.SnomedConceptCreateRequestBuilder;
import com.b2international.snowowl.snomed.datastore.request.SnomedRequests;

/**
 * @since 1.0
 */
public class SnomedConceptRestInput extends AbstractSnomedComponentRestInput<SnomedConceptCreateRequestBuilder> {

	private String definitionStatusId = Concepts.PRIMITIVE;
	private List<SnomedDescriptionRestInput> descriptions = Collections.emptyList();
	private List<SnomedRelationshipRestInput> relationships = Collections.emptyList();
	private List<SnomedRefSetMemberRestInput> members = Collections.emptyList();

	public String getDefinitionStatusId() {
		return definitionStatusId;
	}
	
	public List<SnomedDescriptionRestInput> getDescriptions() {
		return descriptions;
	}
	
	public List<SnomedRelationshipRestInput> getRelationships() {
		return relationships;
	}
	
	public List<SnomedRefSetMemberRestInput> getMembers() {
		return members;
	}

	public void setDefinitionStatusId(String definitionStatusId) {
		this.definitionStatusId = definitionStatusId;
	}
	
	public void setDescriptions(List<SnomedDescriptionRestInput> descriptions) {
		this.descriptions = descriptions;
	}
	
	public void setRelationships(List<SnomedRelationshipRestInput> relationships) {
		this.relationships = relationships;
	}
	
	public void setMembers(List<SnomedRefSetMemberRestInput> members) {
		this.members = members;
	}

	@Override
	protected SnomedConceptCreateRequestBuilder createRequestBuilder() {
		return SnomedRequests.prepareNewConcept()
				.setDefinitionStatusId(getDefinitionStatusId());
	}
	
	@Override
	public SnomedConceptCreateRequestBuilder toRequestBuilder() {
		final SnomedConceptCreateRequestBuilder req = super.toRequestBuilder();
		
		for (SnomedDescriptionRestInput restDescription : getDescriptions()) {
			// Propagate namespaceConceptId from concept
			if (null == restDescription.getNamespaceConceptId()) {
				restDescription.setNamespaceConceptId(getNamespaceConceptId());
			}
			
			// Propagate namespace from concept
			if (null == restDescription.getNamespaceId()) {
				restDescription.setNamespaceId(getNamespaceId());
			}

			req.addDescription(restDescription.toRequestBuilder());
		}
		
		for (SnomedRelationshipRestInput restRelationship : getRelationships()) {
			// Propagate namespaceConceptId from concept
			if (null == restRelationship.getNamespaceConceptId()) {
				restRelationship.setNamespaceConceptId(getNamespaceConceptId());
			}
			
			// Propagate namespace from concept
			if (null == restRelationship.getNamespaceId()) {
				restRelationship.setNamespaceId(getNamespaceId());
			}
			
			req.addRelationship(restRelationship.toRequestBuilder());
		}
		
		for (SnomedRefSetMemberRestInput restMember : getMembers()) {
			req.addMember(restMember.toRequestBuilder());
		}
		
		return req;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("SnomedConceptRestInput [getId()=");
		builder.append(getId());
		builder.append(", getModuleId()=");
		builder.append(getModuleId());
		builder.append(", getDescriptions()=");
		builder.append(getDescriptions());
		builder.append(", getRelationships()=");
		builder.append(getRelationships());
		builder.append("]");
		return builder.toString();
	}
}
