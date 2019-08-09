package co.com.bancolombia.certificacion.googlesuite.questions;

import javax.swing.JOptionPane;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheWord  implements Question<String>{

	
@Override
public String answeredBy(Actor actor) {
	String word=Text.of(GoogleTranslatePage.TARGET_LANGUAGE_TEXT_AREA).viewedBy(actor).asString();
	JOptionPane.showMessageDialog(null, word);
	StringBuilder sb= new StringBuilder(word);
	sb.deleteCharAt(5);
	sb.deleteCharAt(5);
	//sb.deleteCharAt(5);
	
	return sb.toString();
} 

public static TheWord translate() {
	// TODO Auto-generated method stub
	return new TheWord();
}

}