package co.com.google.capacitacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//Lugar donde se ejecutaran las pruebas considerado como el Main
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\co\\com\\google\\capacitacion\\features\\BuscarGoogle.feature", 
glue="co.com.google.capacitacion.stepdefinitions",snippets=SnippetType.CAMELCASE)

public class BuscarGoogleRunner {

	
	
	
}
