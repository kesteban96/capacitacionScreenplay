package pe.com.plazavea.capacitacion.compra.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.plazavea.capacitacion.compra.userinterfaces.RealizarCompra;

public class Personas implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(RealizarCompra.realizarCompra).viewedBy(actor).asString();
		
	}

	public static Personas compran() {
		
		return new Personas();
	}

}
