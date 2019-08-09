package pe.com.plazavea.capacitacion.compra.questions;


import javax.swing.JOptionPane;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.plazavea.capacitacion.compra.userinterfaces.RealizarCompra;

public class Personas implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		
		String word=Text.of(RealizarCompra.realizarCompra).viewedBy(actor).asString();
		JOptionPane.showMessageDialog(null, word);
		return word;
	}

	public static Personas compran() {
		
		return new Personas();
	}

}
