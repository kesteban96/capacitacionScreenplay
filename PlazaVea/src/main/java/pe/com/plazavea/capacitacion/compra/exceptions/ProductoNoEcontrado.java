package pe.com.plazavea.capacitacion.compra.exceptions;

public class ProductoNoEcontrado extends AssertionError{

	public ProductoNoEcontrado(String mensage, Throwable causa) {
		super(mensage, causa);
	}
	
}
