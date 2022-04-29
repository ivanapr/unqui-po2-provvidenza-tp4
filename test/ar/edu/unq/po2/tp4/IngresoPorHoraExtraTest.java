package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngresoPorHoraExtraTest {

	IngresoPorHoraExtra i;
	
	@BeforeEach
	public void setUp() {
		i = new IngresoPorHoraExtra("Mayo", "Pago", 12000d, 4);
	}
	
	@Test
	public void testIngreso() {
		assertEquals("Mayo",i.getMes());
		assertEquals("Pago", i.getConcepto());
		assertEquals(12000d, i.getMonto());
		assertEquals(0d, i.getImponible());
		assertEquals(4, i.getHorasExtra());
	}
}
