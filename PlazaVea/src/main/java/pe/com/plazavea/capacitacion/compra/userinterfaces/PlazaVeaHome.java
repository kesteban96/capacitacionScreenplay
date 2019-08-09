package pe.com.plazavea.capacitacion.compra.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.plazavea.com.pe")
public class PlazaVeaHome extends PageObject{

	public static final Target buscartxt = Target.the("buscar producto").located(By.id("tags"));
	public static final Target seleccionarProducto = Target.the("Seleccionar el producto").locatedBy("//*[@class='buy-button-normal']/a");
	public static final Target seleccionarCarrito = Target.the("Selecioanr carrito").locatedBy("//*[@class='icon-26 h-cart-ico']");
	public static final Target seleccionarComprar = Target.the("comprar").locatedBy("//*[@class='g-boton v2 hc-btn-comprar active']");
}
