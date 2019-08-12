package pe.com.plazavea.capacitacion.compra.tasks;



import javax.swing.JOptionPane;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import pe.com.plazavea.capacitacion.compra.userinterfaces.PlazaVeaHome;

public class BuscarProducto implements Task{

	String producto;
	
	 public BuscarProducto(String producto) {
		this.producto=producto;
	
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(PlazaVeaHome.seleccionar));
		actor.attemptsTo(Enter.theValue(producto).into(PlazaVeaHome.buscartxt));
		actor.attemptsTo(Hit.the(Keys.ENTER).into(PlazaVeaHome.buscartxt));
		actor.attemptsTo(Click.on(PlazaVeaHome.seleccionarProducto));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(PlazaVeaHome.agregarProducto));
		actor.attemptsTo(Click.on(PlazaVeaHome.seleccionarCarrito));
		actor.attemptsTo(Click.on(PlazaVeaHome.seleccionarComprar));
	}

	public static BuscarProducto to(String producto) {
		return Tasks.instrumented(BuscarProducto.class,producto);
		
	}

}
