package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
	}
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
	}
	public double getPrecio() {
		return precio * 0.9;
	}
}
