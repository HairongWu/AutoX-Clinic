/*
 * Copyright 2017-2018 B2i Healthcare, https://b2ihealthcare.com
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

import com.b2international.snowowl.core.repository.RevisionDocument;
import com.b2international.snowowl.core.request.DeleteRequestBuilder;

/**
 * @since 5.7
 */
public final class SnomedDeleteRequestBuilder extends DeleteRequestBuilder implements SnomedTransactionalRequestBuilder<Boolean> {

	public SnomedDeleteRequestBuilder(String componentId, Class<? extends RevisionDocument> type) {
		super(componentId, type);
	}

}