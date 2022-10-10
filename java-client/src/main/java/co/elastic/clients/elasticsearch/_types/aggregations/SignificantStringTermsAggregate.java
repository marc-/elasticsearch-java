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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.SignificantStringTermsAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.SignificantStringTermsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class SignificantStringTermsAggregate extends MultiBucketAggregateBase<SignificantStringTermsBucket>
		implements
			AggregateVariant {
	@Nullable
	private final Long bgCount;

	@Nullable
	private final Long docCount;

	// ---------------------------------------------------------------------------------------------

	private SignificantStringTermsAggregate(Builder builder) {
		super(builder);

		this.bgCount = builder.bgCount;
		this.docCount = builder.docCount;

	}

	public static SignificantStringTermsAggregate of(
			Function<Builder, ObjectBuilder<SignificantStringTermsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.Sigsterms;
	}

	/**
	 * API name: {@code bg_count}
	 */
	@Nullable
	public final Long bgCount() {
		return this.bgCount;
	}

	/**
	 * API name: {@code doc_count}
	 */
	@Nullable
	public final Long docCount() {
		return this.docCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.bgCount != null) {
			generator.writeKey("bg_count");
			generator.write(this.bgCount);

		}
		if (this.docCount != null) {
			generator.writeKey("doc_count");
			generator.write(this.docCount);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SignificantStringTermsAggregate}.
	 */

	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<SignificantStringTermsBucket, Builder>
			implements
				ObjectBuilder<SignificantStringTermsAggregate> {
		@Nullable
		private Long bgCount;

		@Nullable
		private Long docCount;

		/**
		 * API name: {@code bg_count}
		 */
		public final Builder bgCount(@Nullable Long value) {
			this.bgCount = value;
			return this;
		}

		/**
		 * API name: {@code doc_count}
		 */
		public final Builder docCount(@Nullable Long value) {
			this.docCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SignificantStringTermsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SignificantStringTermsAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new SignificantStringTermsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SignificantStringTermsAggregate}
	 */
	public static final JsonpDeserializer<SignificantStringTermsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SignificantStringTermsAggregate::setupSignificantStringTermsAggregateDeserializer);

	protected static void setupSignificantStringTermsAggregateDeserializer(
			ObjectDeserializer<SignificantStringTermsAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op,
				SignificantStringTermsBucket._DESERIALIZER);
		op.add(Builder::bgCount, JsonpDeserializer.longDeserializer(), "bg_count");
		op.add(Builder::docCount, JsonpDeserializer.longDeserializer(), "doc_count");

	}

}
