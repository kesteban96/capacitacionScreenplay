package co.com.bancolombia.certificacion.googlesuite.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;;
 
public class GoTo implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(GoogleAppsComponents.GOOGLE_APPS),
		Click.on(GoogleAppsComponents.GOOGLE_TRANSLATE));
	}

	public static GoTo theAPP() {
		
		return instrumented(GoTo.class);
	}

}
