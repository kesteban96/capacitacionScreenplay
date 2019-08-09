package co.com.google.capacitacion.questions;

import co.com.google.capacitacion.userinterfaces.GoogleOpenWiki;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Buscar implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		String word =Text.of(GoogleOpenWiki.openWiki).viewedBy(actor).asString();
		StringBuilder sb= new StringBuilder(word);
		sb.deleteCharAt(5);
		sb.deleteCharAt(5); 
		return sb.toString();	
	}

	public static Buscar palabra() {
		
		return new Buscar();
	}


}
