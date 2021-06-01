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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.delete_calendar_job.Response
public final class DeleteCalendarJobResponse implements ToJsonp {
	private final String calendarId;

	@Nullable
	private final String description;

	private final List<String> jobIds;

	// ---------------------------------------------------------------------------------------------

	protected DeleteCalendarJobResponse(Builder builder) {

		this.calendarId = Objects.requireNonNull(builder.calendarId, "calendar_id");
		this.description = builder.description;
		this.jobIds = Objects.requireNonNull(builder.jobIds, "job_ids");

	}

	/**
	 * API name: {@code calendar_id}
	 */
	public String calendarId() {
		return this.calendarId;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code job_ids}
	 */
	public List<String> jobIds() {
		return this.jobIds;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("calendar_id");
		generator.write(this.calendarId);

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

		generator.writeKey("job_ids");
		generator.writeStartArray();
		for (String item0 : this.jobIds) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteCalendarJobResponse}.
	 */
	public static class Builder implements ObjectBuilder<DeleteCalendarJobResponse> {
		private String calendarId;

		@Nullable
		private String description;

		private List<String> jobIds;

		/**
		 * API name: {@code calendar_id}
		 */
		public Builder calendarId(String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code job_ids}
		 */
		public Builder jobIds(List<String> value) {
			this.jobIds = value;
			return this;
		}

		/**
		 * API name: {@code job_ids}
		 */
		public Builder jobIds(String... value) {
			this.jobIds = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #jobIds(List)}, creating the list if needed.
		 */
		public Builder addJobIds(String value) {
			if (this.jobIds == null) {
				this.jobIds = new ArrayList<>();
			}
			this.jobIds.add(value);
			return this;
		}

		/**
		 * Builds a {@link DeleteCalendarJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteCalendarJobResponse build() {

			return new DeleteCalendarJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for DeleteCalendarJobResponse
	 */
	public static final JsonpValueParser<DeleteCalendarJobResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, DeleteCalendarJobResponse::setupDeleteCalendarJobResponseParser);

	protected static void setupDeleteCalendarJobResponseParser(
			DelegatingJsonpValueParser<DeleteCalendarJobResponse.Builder> op) {

		op.add(Builder::calendarId, JsonpValueParser.stringParser(), "calendar_id");
		op.add(Builder::description, JsonpValueParser.stringParser(), "description");
		op.add(Builder::jobIds, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "job_ids");

	}

}