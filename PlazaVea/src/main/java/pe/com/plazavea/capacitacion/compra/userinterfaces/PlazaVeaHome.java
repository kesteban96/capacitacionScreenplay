package pe.com.plazavea.capacitacion.compra.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.plazavea.com.pe")
public class PlazaVeaHome extends PageObject{
	
	public static final Target seleccionar = Target.the("seleccionar electro").locatedBy(("//*[@class='Header__top__item__icon pvaicon pvaicon pvaicon-04-electro']"));
	public static final Target buscartxt = Target.the("buscar producto").located(By.id("search_box"));
	public static final Target seleccionarProducto = Target.the("Seleccionar el producto").locatedBy("//*[@title='Televisor LG LED 49\" FHD Smart TV 49LK5400']");
	public static final Target agregarProducto = Target.the("Seleccionar el producto").locatedBy(("//div[@class='ProductCard__resume']//a[@id='ProductCard__add-to-cart']"));
	public static final Target seleccionarCarrito = Target.the("Selecioanr carrito").locatedBy("//*[@class='cart__ico']");
	public static final Target seleccionarComprar = Target.the("comprar").locatedBy("//*[@class='button istertiary']");
}
