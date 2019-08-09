package co.com.bancolombia.certificacion.googlesuite.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//Clase desde donde se ejecuta todo el programa  

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resource/features/Google_translate.feature",
		glue="co.com.bancolombia.certificacion.googlesuite.stepdefinitions",
		snippets=SnippetType.CAMELCASE)

public class GoogleTranslateRunner {

}
