package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	ArrayList<IngresoPercibido> ingresos;
	public Trabajador() {
		ingresos= new ArrayList<IngresoPercibido>();
	}
	public Trabajador recibirIngreso(IngresoPercibido ingreso) {
		ingresos.add(ingreso);
		return this;
	}
	public double getTotalPercibido() {
		double total = 0;
		for(IngresoPercibido ingreso:ingresos) {
			total += ingreso.getMonto();
		}
		return total;
	}
	public double getMontoImponible() {
		double total = 0;
		for(IngresoPercibido ingreso:ingresos) {
			total += ingreso.getImponible();
		}
		return total;
	}
	public double getImpuestosAPagar() {
		return this.getMontoImponible() * 0.02;
	}
}
