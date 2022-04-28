package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esCuidado) {
		super(nombre, precio, esCuidado);
	}
	public double getPrecio() {
		return precio * 0.9;
	}
}
