package pe.com.plazavea.capacitacion.compra.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaPagina implements Task {

	PageObject abrir;
	
	public AbrirLaPagina(PageObject abrir) {
		this.abrir=abrir;
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(abrir));
		
		
	}

	public static AbrirLaPagina en(PageObject abrir) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(AbrirLaPagina.class, abrir);
	}

}
