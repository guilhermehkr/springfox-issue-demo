package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModelProperty;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableDetail.class)
@JsonDeserialize(as = ImmutableDetail.class)
@Value.Style(
        forceJacksonIgnoreFields = true,
        validationMethod = Value.Style.ValidationMethod.VALIDATION_API,
        defaultAsDefault = true,
        get = {"get*", "is*"},
        jdkOnly = true
)
public interface Detail {

    @ApiModelProperty(value = "Field Detail", required = true)
    String getDetail();
}
