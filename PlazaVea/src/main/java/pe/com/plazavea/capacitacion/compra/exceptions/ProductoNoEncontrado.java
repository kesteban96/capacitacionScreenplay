package pe.com.plazavea.capacitacion.compra.exceptions;

public class ProductoNoEncontrado extends AssertionError{

	
	private static final String Producto_No_Encontrado= "Producto no encontrado";
	public static String getProductoNoEncontradoMessage() {
		return Producto_No_Encontrado;
	}
	
	public ProductoNoEncontrado(String mensage, Throwable causa) {
		super(mensage, causa);
	}
	
}
