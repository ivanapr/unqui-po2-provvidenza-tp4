package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	String nombre;
	String direccion;
	ArrayList <Producto> stock;
	public Supermercado(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		stock = new ArrayList<Producto>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void agregarProducto(Producto producto) {
		stock.add(producto);
	}
	public int getCantidadDeProductos() {
		return stock.size();
	}
	public double getPrecioTotal() {
		double total = 0;
		for(Producto producto:stock) {
			total += producto.getPrecio();
		}
		return total;
	}
}
