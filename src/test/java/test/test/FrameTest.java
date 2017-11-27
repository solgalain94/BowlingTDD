package test.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FrameTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void ceroDevuelveUno() {
		Factorial fc= new Factorial();
		assertEquals(1, fc.resultado(0));
	}
	@Test 
	public void unoDevuelveUno() {
		Factorial fc= new Factorial();
		assertEquals(1, fc.resultado(1));
	}
	@Test
	public void otroNumeroDevuelve() {
		Factorial fc= new Factorial();
		assertEquals(6, fc.resultado(3));
	}

}
