package co.com.google.capacitacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleOpenWiki extends PageObject{

	//Se mapea la URL con la cual se va hacer la verificacion de la busqueda 
	public static final Target openWiki = Target.the("URL wiki-pedia").locatedBy("//*/div/a[@href='https://es.wikipedia.org/wiki/Quesito']");
	
}
