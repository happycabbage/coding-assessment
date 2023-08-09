package com.hca.codingassessment.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.inferred.freebuilder.FreeBuilder;

import java.sql.Timestamp;
import java.util.UUID;

@JsonDeserialize(builder = Transaction.Builder.class)
@FreeBuilder
public interface Transaction {
    UUID getId();

    Double getBasketSize();

    UUID getBudtenderId();

    UUID getLocationId();

    Timestamp getTimestamp();

    class Builder extends Transaction_Builder {

        @Override
        @JsonProperty("timestamp")
        @JsonDeserialize(using = UnixTimestampDeserializer.class)
        public Transaction.Builder setTimestamp(Timestamp timestamp) {
            return super.setTimestamp(timestamp);
        }
    }

    Builder toBuilder();

}
