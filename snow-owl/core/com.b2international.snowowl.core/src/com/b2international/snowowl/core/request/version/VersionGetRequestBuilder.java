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
package com.b2international.snowowl.core.request.version;

import com.b2international.snowowl.core.context.ResourceRepositoryRequestBuilder;
import com.b2international.snowowl.core.domain.RepositoryContext;
import com.b2international.snowowl.core.request.GetResourceRequestBuilder;
import com.b2international.snowowl.core.version.Version;
import com.b2international.snowowl.core.version.Versions;

/**
 * @since 8.0
 */
public final class VersionGetRequestBuilder
		extends GetResourceRequestBuilder<VersionGetRequestBuilder, VersionSearchRequestBuilder, RepositoryContext, Versions, Version>
		implements ResourceRepositoryRequestBuilder<Version> {

	public VersionGetRequestBuilder(String versionId) {
		super(new VersionGetRequest(versionId));
	}
	
}
