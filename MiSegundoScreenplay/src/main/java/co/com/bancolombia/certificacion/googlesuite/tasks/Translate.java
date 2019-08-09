package co.com.bancolombia.certificacion.googlesuite.tasks;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION));
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE));
		actor.attemptsTo(Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTION));	
		actor.attemptsTo(Click.on(GoogleTranslatePage.TARGET_LANGUAGE));
		actor.attemptsTo(Enter.theValue("cheese").into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXT_AREA));
		
		
		
		
	}

	public static Translate the() {
	
		return Tasks.instrumented(Translate.class); 
	}

	
	
}
