package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoPercibidoTest {

	IngresoPercibido i;
	
	@BeforeEach
	public void setUp() {
		i = new IngresoPercibido("Mayo", "Pago", 60000d);
	}
	
	@Test
	public void testIngreso() {
		assertEquals("Mayo",i.getMes());
		assertEquals("Pago", i.getConcepto());
		assertEquals(60000d, i.getMonto());
		assertEquals(60000d, i.getImponible());
	}
}
