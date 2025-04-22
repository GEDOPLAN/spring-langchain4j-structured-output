package de.gedoplan.showcase.langchain4jdemo;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PersonInformationExtractor {

  @SystemMessage("""
    Du bist ein Assistent der Informationen über eine Person aus einem Text extrahierst und strukturiert zurückgibst.
    Stelle dabei sicher, dass du keine Informationen vergisst, aber auch keine neuen Informationen hinzufügst die nicht vorhanden sind.
    Wenn eine Informationen nicht im Text vorkommt gebe den Wert null zurück.""")
  PersonInformation extractPersonInformationSystemMessage(String input);

  @UserMessage("""
    Der folgende Text enthält Informationen über eine Person.
    Bitte extrahiere die Informationen aus dem Text und gebe sie strukturiert zurück.
    Stelle dabei sicher, dass du keine Informationen vergisst, aber auch keine neuen Informationen hinzufügst die nicht vorhanden sind.
    Wenn eine Informationen nicht im Text vorkommt gebe den Wert null zurück.
    ---
    {{it}}
    ---""")
  PersonInformation extractPersonInformationUserMessage(String input);

}
