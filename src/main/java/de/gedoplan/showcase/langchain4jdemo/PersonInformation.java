package de.gedoplan.showcase.langchain4jdemo;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.langchain4j.model.output.structured.Description;

@Description("personal information")
public record PersonInformation(
    @JsonProperty(required = true)
    String givenName,
    @JsonProperty(required = true)
    String surname,
    @JsonProperty(required = true)
    Boolean married,
    @JsonProperty(required = true)
    @Description("place of residence")
    String city
) {
}
