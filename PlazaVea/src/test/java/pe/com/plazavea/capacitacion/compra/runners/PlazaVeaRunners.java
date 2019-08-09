package pe.com.plazavea.capacitacion.compra.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resource/feature/RealizarCompra.feature",
		glue="pe.com.plazavea.capacitacion.compra.stepdefinitions",
		snippets=SnippetType.CAMELCASE
		)
public class PlazaVeaRunners {

}
