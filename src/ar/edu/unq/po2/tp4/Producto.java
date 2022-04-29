package ar.edu.unq.po2.tp4;

public class Producto {
	String nombre;
	double precio;
	boolean precioCuidado = false;
	public Producto(String nombre, double precio, boolean precioCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPrecioCuidado(precioCuidado);
	}
	public Producto(String nombre, double precio) {
		this.setPrecio(precio);
		this.setNombre(nombre);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	public void setPrecioCuidado(boolean esCuidado) {
		this.precioCuidado = esCuidado;
	}
	public void aumentarPrecio(double aumento) {
		this.setPrecio(this.getPrecio() + aumento);
	}
}
