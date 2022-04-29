package ar.edu.unq.po2.tp4;

public class IngresoPorHoraExtra extends IngresoPercibido {
	int horasExtra = 0;
	public IngresoPorHoraExtra(String mes, String concepto, double monto, int horas) {
		super(mes, concepto, monto);
		this.setHorasExtra(horas);
	}
	public int getHorasExtra() {
		return horasExtra;
	}
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
	@Override
	public double getImponible() {
		return 0d;
	}
}
