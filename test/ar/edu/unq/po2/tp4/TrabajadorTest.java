package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	private IngresoPercibido i1, i2;
	private IngresoPorHoraExtra i3;
	private Trabajador t1;
	
	@BeforeEach
	public void setUp() {
		t1 = new Trabajador();
		i1 = new IngresoPercibido("Enero", "1", 60000d);
		i2 = new IngresoPercibido("Agosto", "2", 80000d);
		i3 = new IngresoPorHoraExtra("Agosto", "3", 20000d, 8);
		t1.recibirIngreso(i1).recibirIngreso(i2).recibirIngreso(i3);
	}
	@Test
	public void testImpuestos() {
		assertEquals(160000d,t1.getTotalPercibido());
		assertEquals(140000d,t1.getMontoImponible());
		assertEquals(2800d,t1.getImpuestosAPagar());
	}
}
