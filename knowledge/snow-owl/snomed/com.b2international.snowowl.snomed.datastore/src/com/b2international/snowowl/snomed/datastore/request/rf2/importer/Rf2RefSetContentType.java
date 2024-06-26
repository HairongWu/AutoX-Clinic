/*
 * Copyright 2017-2024 B2i Healthcare, https://b2ihealthcare.com
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
package com.b2international.snowowl.snomed.datastore.request.rf2.importer;

import java.util.UUID;

import com.b2international.snowowl.core.request.io.ImportDefectAcceptor.ImportDefectBuilder;
import com.b2international.snowowl.snomed.core.domain.refset.SnomedReferenceSetMember;
import com.b2international.snowowl.snomed.datastore.request.rf2.validation.Rf2ValidationDefects;

/**
 * @since 6.0.0
 */
interface Rf2RefSetContentType extends Rf2ContentType<SnomedReferenceSetMember> {

	@Override
	default SnomedReferenceSetMember create() {
		return new SnomedReferenceSetMember();
	}
	
	@Override
	default String getContainerId(String[] values) {
		final String referencedComponentId = values[5];
		return referencedComponentId;
	}
	
	@Override
	default long getDependentComponentId(String[] values) {
		return Long.parseLong(getContainerId(values));
	}
	
	@Override
	default void validateByContentType(ImportDefectBuilder defectBuilder, String[] values) {
		final String memberId = values[0];
		final String refsetId = values[4];
		final String referencedComponentId = values[5];
		
		defectBuilder
			.whenThrows(() -> UUID.fromString(memberId))
			.error("%s %s", Rf2ValidationDefects.INVALID_UUID, memberId);
		
		validateId(defectBuilder, referencedComponentId);
		validateConceptIds(defectBuilder, refsetId);
		validateMembersByReferenceSetContentType(defectBuilder, values);
	}
	
	void validateMembersByReferenceSetContentType(ImportDefectBuilder defectBuilder, String[] values);
}
