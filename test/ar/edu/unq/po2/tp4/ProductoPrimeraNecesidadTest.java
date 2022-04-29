package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche, pan, polenta;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.9d);
		pan = new ProductoPrimeraNecesidad("Pan", 1d, true, 0.7d);
		polenta = new ProductoPrimeraNecesidad("Polenta", 4d, false, 0.9d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
		assertEquals(0.7, pan.getPrecio());
		assertEquals(3.6, polenta.getPrecio());
	}
}
