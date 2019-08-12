package pe.com.plazavea.capacitacion.compra.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import pe.com.plazavea.capacitacion.compra.exceptions.ProductoNoEncontrado;
import pe.com.plazavea.capacitacion.compra.models.ProductoAutomatizacion;
import pe.com.plazavea.capacitacion.compra.models.ProductoComprado;
import pe.com.plazavea.capacitacion.compra.questions.Personas;
import pe.com.plazavea.capacitacion.compra.tasks.AbrirLaPagina;
import pe.com.plazavea.capacitacion.compra.tasks.BuscarProducto;
import pe.com.plazavea.capacitacion.compra.userinterfaces.PlazaVeaHome;




public class PlazaVeaStepDefinitions {	
	
	
	@Managed(driver="chrome")	
	WebDriver miDriver;
	Actor kevin = Actor.named("kevin");
	PlazaVeaHome plazaVeaHome;
	
	@Before
	public void setUp() {
		
		
		kevin.can(BrowseTheWeb.with(miDriver));
	}
	
	@Given("^Que Kevin ingresa a la pagina de plaza vea$")
	public void queKevinIngresaALaPaginaDePlazaVea() throws Exception {
	   
		//Proceso de abrir el navegador
		kevin.wasAbleTo(AbrirLaPagina.en(plazaVeaHome));
	}

	@When("^Realice la compra del producto(.*)$")
	public void realiceLaCompraDelProducto(List<ProductoAutomatizacion> producto) throws Exception {
	
			kevin.wasAbleTo(BuscarProducto.to(producto.get(0).getProducto()));
	}

	@Then("^Deberia ver su (.*)$")
	public void deberiaVerSu(List<ProductoComprado> productocomprado) throws Exception {
	   
		kevin.should(seeThat(Personas.compran(),containsString(productocomprado.get(0).getProductocomprado())).orComplainWith(ProductoNoEncontrado.class,ProductoNoEncontrado.getProductoNoEncontradoMessage()));
	}
}
