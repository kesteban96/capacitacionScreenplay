package co.com.bancolombia.certificacion.googlesuite.stepdefinitions;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.googlesuite.questions.TheWord;
import co.com.bancolombia.certificacion.googlesuite.tasks.GoTo;
import co.com.bancolombia.certificacion.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.googlesuite.tasks.Translate;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {

	@Managed(driver= "chrome")
	private WebDriver herBrowser; 
	private Actor susan = Actor.named("susan");
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^Than susan wants to translate a word$")
	public void thanSusanWantsToTranslateAWord() throws Exception {
		
	    //Se abre el  navegador y se va a la opcion de las aplicaciones de google
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),
		 GoTo.theAPP());
	}

	@When("^she translates the word cheese from english to spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
	   
		//Proceso de tradución de la palabra requerida 
		susan.wasAbleTo(Translate.the());
	}

	@Then("^she should see the word  queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
	  
		//Proceso de verificación del resultado con la palabra indicada
		susan.should(seeThat(TheWord.translate(),equalTo("queso")));
	}


	
	
}
