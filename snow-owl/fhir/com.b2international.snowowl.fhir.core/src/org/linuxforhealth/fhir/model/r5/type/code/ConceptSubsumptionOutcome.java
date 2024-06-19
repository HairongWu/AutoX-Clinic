/*
 * (C) Copyright IBM Corp. 2019, 2022
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.linuxforhealth.fhir.model.r5.type.code;

import org.linuxforhealth.fhir.model.annotation.System;
import org.linuxforhealth.fhir.model.r5.type.Code;
import org.linuxforhealth.fhir.model.r5.type.Extension;
import org.linuxforhealth.fhir.model.r5.type.String;

import java.util.Collection;
import java.util.Objects;

import javax.annotation.Generated;

@System("http://hl7.org/fhir/concept-subsumption-outcome")
@Generated("org.linuxforhealth.fhir.tools.CodeGenerator")
public class ConceptSubsumptionOutcome extends Code {
    /**
     * Equivalent
     * 
     * <p>A equivalent to B if A subsumes B and B subsumes A
     */
    public static final ConceptSubsumptionOutcome EQUIVALENT = ConceptSubsumptionOutcome.builder().value(Value.EQUIVALENT).build();

    /**
     * Subsumes
     * 
     * <p>A subsumes B if there is a subsumption relationship between A and B
     */
    public static final ConceptSubsumptionOutcome SUBSUMES = ConceptSubsumptionOutcome.builder().value(Value.SUBSUMES).build();

    /**
     * Subsumed-By
     * 
     * <p>A subsumed by B if B subsumes A
     */
    public static final ConceptSubsumptionOutcome SUBSUMED_BY = ConceptSubsumptionOutcome.builder().value(Value.SUBSUMED_BY).build();

    /**
     * Not-Subsumed
     * 
     * <p>Neither A subsumes B nor B subsumes A
     */
    public static final ConceptSubsumptionOutcome NOT_SUBSUMED = ConceptSubsumptionOutcome.builder().value(Value.NOT_SUBSUMED).build();

    private volatile int hashCode;

    private ConceptSubsumptionOutcome(Builder builder) {
        super(builder);
    }

    /**
     * Get the value of this ConceptSubsumptionOutcome as an enum constant.
     */
    public Value getValueAsEnum() {
        return (value != null) ? Value.from(value) : null;
    }

    /**
     * Factory method for creating ConceptSubsumptionOutcome objects from a passed enum value.
     */
    public static ConceptSubsumptionOutcome of(Value value) {
        switch (value) {
        case EQUIVALENT:
            return EQUIVALENT;
        case SUBSUMES:
            return SUBSUMES;
        case SUBSUMED_BY:
            return SUBSUMED_BY;
        case NOT_SUBSUMED:
            return NOT_SUBSUMED;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating ConceptSubsumptionOutcome objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static ConceptSubsumptionOutcome of(java.lang.String value) {
        return of(Value.from(value));
    }

    /**
     * Inherited factory method for creating ConceptSubsumptionOutcome objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static String string(java.lang.String value) {
        return of(Value.from(value));
    }

    /**
     * Inherited factory method for creating ConceptSubsumptionOutcome objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static Code code(java.lang.String value) {
        return of(Value.from(value));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ConceptSubsumptionOutcome other = (ConceptSubsumptionOutcome) obj;
        return Objects.equals(id, other.id) && Objects.equals(extension, other.extension) && Objects.equals(value, other.value);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Objects.hash(id, extension, value);
            hashCode = result;
        }
        return result;
    }

    public Builder toBuilder() {
        return new Builder().from(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Code.Builder {
        private Builder() {
            super();
        }

        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder value(java.lang.String value) {
            return (value != null) ? (Builder) super.value(Value.from(value).value()) : this;
        }

        /**
         * Primitive value for code
         * 
         * @param value
         *     An enum constant for ConceptSubsumptionOutcome
         * 
         * @return
         *     A reference to this Builder instance
         */
        public Builder value(Value value) {
            return (value != null) ? (Builder) super.value(value.value()) : this;
        }

        @Override
        public ConceptSubsumptionOutcome build() {
            ConceptSubsumptionOutcome conceptSubsumptionOutcome = new ConceptSubsumptionOutcome(this);
            if (validating) {
                validate(conceptSubsumptionOutcome);
            }
            return conceptSubsumptionOutcome;
        }

        protected void validate(ConceptSubsumptionOutcome conceptSubsumptionOutcome) {
            super.validate(conceptSubsumptionOutcome);
        }

        protected Builder from(ConceptSubsumptionOutcome conceptSubsumptionOutcome) {
            super.from(conceptSubsumptionOutcome);
            return this;
        }
    }

    public enum Value {
        /**
         * Equivalent
         * 
         * <p>A equivalent to B if A subsumes B and B subsumes A
         */
        EQUIVALENT("equivalent"),

        /**
         * Subsumes
         * 
         * <p>A subsumes B if there is a subsumption relationship between A and B
         */
        SUBSUMES("subsumes"),

        /**
         * Subsumed-By
         * 
         * <p>A subsumed by B if B subsumes A
         */
        SUBSUMED_BY("subsumed-by"),

        /**
         * Not-Subsumed
         * 
         * <p>Neither A subsumes B nor B subsumes A
         */
        NOT_SUBSUMED("not-subsumed");

        private final java.lang.String value;

        Value(java.lang.String value) {
            this.value = value;
        }

        /**
         * @return
         *     The java.lang.String value of the code represented by this enum
         */
        public java.lang.String value() {
            return value;
        }

        /**
         * Factory method for creating ConceptSubsumptionOutcome.Value values from a passed string value.
         * 
         * @param value
         *     A string that matches one of the allowed code values
         * @return
         *     The corresponding ConceptSubsumptionOutcome.Value or null if a null value was passed
         * @throws IllegalArgumentException
         *     If the passed string is not null and cannot be parsed into an allowed code value
         */
        public static Value from(java.lang.String value) {
            if (value == null) {
                return null;
            }
            switch (value) {
            case "equivalent":
                return EQUIVALENT;
            case "subsumes":
                return SUBSUMES;
            case "subsumed-by":
                return SUBSUMED_BY;
            case "not-subsumed":
                return NOT_SUBSUMED;
            default:
                throw new IllegalArgumentException(value);
            }
        }
    }
}
