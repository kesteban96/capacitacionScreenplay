package co.com.google.capacitacion.tasks;

import co.com.google.capacitacion.userinterfaces.GoogleHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarLaPalabra implements Task {

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		//Se ingresa el texto a buscar en el campo requerido
		actor.attemptsTo(Enter.theValue("quesito").into(GoogleHome.txtBuscar));
		//Se realiza la acción de buscar 
		actor.attemptsTo(Click.on(GoogleHome.txtir));
		
	}
	
	public static Performable to() {
		
		return Tasks.instrumented(BuscarLaPalabra.class);
	}

	
	
}
