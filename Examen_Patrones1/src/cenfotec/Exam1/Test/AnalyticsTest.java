package cenfotec.Exam1.Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cenfotec.Exam1.Analytics;

public class AnalyticsTest {

	Analytics VP = new Analytics();

	// Punto A
	@Test
	public void testCalcularLarga() throws Exception {
		assertEquals("casa,cosa", VP.ValoresPalabraLarga("casa,cosa"));

	}

	// Punto B
	@Test
	public void testCalcularCorta() throws Exception {

	}

	// Punto C
	@Test
	public void testCalcularLargaAlfabeticamente() throws Exception {

	}

	// Punto D
	@Test
	public void testCalcularLCortaAlfabeticamente() throws Exception {

	}

}
