package co.com.google.capacitacion.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.WebDriver;

import co.com.google.capacitacion.questions.Buscar;
import co.com.google.capacitacion.tasks.AbrirLaPagina;
import co.com.google.capacitacion.tasks.BuscarLaPalabra;
import co.com.google.capacitacion.userinterfaces.GoogleHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

//responsabilidad configuracion

public class BuscarGoogleStepDefinitios {
	
	//Driver del navegador chrome
	@Managed(driver="chrome")
	WebDriver suDriver;
	Actor kevin= Actor.named("kevin");
	GoogleHome googleHome;
	
	@Before
	public void setUp() {
		
		kevin.can(BrowseTheWeb.with(suDriver));
	}
	
	
	@Given("^Que kevin esta en la pagina de google$")
	public void queKevinEstaEnLaPaginaDeGoogle() throws Exception {
		
		//Proceso para abrir la pagina 
	    kevin.wasAbleTo(AbrirLaPagina.en(googleHome));
	    
	}
	
	@When("^Cuando busca la palabra \"([^\"]*)\"$")
	public void cuandoBuscaLaPalabra(String arg1) throws Exception {
	    
		//Proceso para buscar la palabra en el traductor 
		kevin.wasAbleTo(BuscarLaPalabra.to());
	}

	@Then("^Deberia ver el resultado de wikipedia$")
	public void deberiaVerElResultadoDeWikipedia() throws Exception {
		
		//Proceso para verificar que la traduccion de la palabra fue correcta 
	    kevin.should(seeThat(Buscar.palabra(),containsString("https://es.wikipedia.org/wiki/Quesito")));
		
		
	    
	}




}
