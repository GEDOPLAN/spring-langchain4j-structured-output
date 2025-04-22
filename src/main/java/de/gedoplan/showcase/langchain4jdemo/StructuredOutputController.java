package de.gedoplan.showcase.langchain4jdemo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StructuredOutputController {

  private PersonInformationExtractor personInformationExtractor;

  public StructuredOutputController(PersonInformationExtractor personInformationExtractor) {
    this.personInformationExtractor = personInformationExtractor;
  }

  @PostMapping(value = "/extractPersonInformationSystem", consumes = "text/plain")
  public PersonInformation extractPersonInformationSystem(@RequestBody String message) {
    return personInformationExtractor.extractPersonInformationSystemMessage(message);
  }

  @PostMapping(value = "/extractPersonInformationUser", consumes = "text/plain")
  public PersonInformation extractPersonInformationUser(@RequestBody String message) {
    return personInformationExtractor.extractPersonInformationUserMessage(message);
  }


}
