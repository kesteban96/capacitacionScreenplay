package co.com.bancolombia.certificacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponents{

	public static final Target GOOGLE_APPS = Target.the("google apps button").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("google translate options").locatedBy(("//*[@id='gb51']|//*[@pid='51'] "));
}
