package ar.edu.unq.po2.tp4;

public class IngresoPercibido {
	String mes, concepto;
	double monto = 0;
	public IngresoPercibido(String mes, String concepto, double monto) {
		this.setMes(mes);
		this.setConcepto(concepto);
		this.setMonto(monto);
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getImponible() {
		return this.getMonto();
	}
}
