package fiuba.algo3.tp2.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.tp2.modelo.Quini;

public class QuiniTest {

	@Test
	public void nuevoQuiniNoNull() {
		assertNotNull(new Quini(0));
	}

}
