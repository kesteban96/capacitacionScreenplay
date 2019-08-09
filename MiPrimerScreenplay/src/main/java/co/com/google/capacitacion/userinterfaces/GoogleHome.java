package co.com.google.capacitacion.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

//La responsabilidad es mapeo

@DefaultUrl("https://www.google.com")
public class GoogleHome extends PageObject {

	
	// Se mapea la caja de texto donde se va ingresar la palabra
	public static final Target txtBuscar = Target.the("caja de texto").located(By.name("q"));
	//Se mapea el boton que nos realizara la busqueda 
	public static final Target txtir = Target.the("boton de ir ").located(By.className("gNO89b"));
	
	
}
