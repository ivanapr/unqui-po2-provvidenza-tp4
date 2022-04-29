package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	double descuento = 0.9;
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) {
		super(nombre, precio, precioCuidado);
		this.setDescuento(descuento);
	}
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado) {
		super(nombre, precio);
	}
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
	}
	public double getPrecio() {
		return super.getPrecio() * this.getDescuento();
	}
	public double getDescuento() {
		return this.descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
}
