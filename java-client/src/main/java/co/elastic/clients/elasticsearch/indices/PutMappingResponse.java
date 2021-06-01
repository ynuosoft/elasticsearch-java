/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.IndicesResponseBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

// typedef: indices.put_mapping.Response
public final class PutMappingResponse extends IndicesResponseBase {
	// ---------------------------------------------------------------------------------------------

	protected PutMappingResponse(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutMappingResponse}.
	 */
	public static class Builder extends IndicesResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutMappingResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutMappingResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutMappingResponse build() {

			return new PutMappingResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PutMappingResponse
	 */
	public static final JsonpValueParser<PutMappingResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutMappingResponse::setupPutMappingResponseParser);

	protected static void setupPutMappingResponseParser(DelegatingJsonpValueParser<PutMappingResponse.Builder> op) {
		IndicesResponseBase.setupIndicesResponseBaseParser(op);

	}

}