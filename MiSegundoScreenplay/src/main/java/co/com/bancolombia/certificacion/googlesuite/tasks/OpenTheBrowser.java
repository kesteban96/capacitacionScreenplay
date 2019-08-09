package co.com.bancolombia.certificacion.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;;

//Esta clase la creamos desde el given y es considerada la tarea que recibe nuestro actor 

//Para que una clase se convierta en una tarea debemos usar implements y decir de donde implementa
//Cuando implementamos task nos convertimos hijos de performance 

public class OpenTheBrowser implements Task {

	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page=page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Open.browserOn(page));
		
	}

	public static OpenTheBrowser on(PageObject page) {
		
		return instrumented(OpenTheBrowser.class, page); 
	}

	
	
	
}
