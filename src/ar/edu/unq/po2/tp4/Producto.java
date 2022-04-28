package ar.edu.unq.po2.tp4;

public class Producto {
	String nombre;
	double precio;
	boolean esCuidado = false;
	public String getNombre() {
		return nombre;
	}
	public Producto(String nombre, double precio, boolean esCuidado) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsCuidado(esCuidado);
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
	public boolean getEsCuidado() {
		return esCuidado;
	}
	public void setEsCuidado(boolean esCuidado) {
		this.esCuidado = esCuidado;
	}
	
}
