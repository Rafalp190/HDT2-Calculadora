import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculadoraTest.
 */
public class CalculadoraTest {
	
	/** The calcu. */
	private CalcuPost calcu;
	
	/**
	 * Test.
	 */
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	/**
	 * Test calcular.
	 *
	 * @throws Exception the exception
	 */
	public void testCalcular() throws Exception{
		assertEquals(15,calcu.Calcular("12+4*3+")); //calcular correctamente
	}
	
	/**
	 * Test leer archivo.
	 *
	 * @throws Exception the exception
	 */
	public void testLeerArchivo() throws Exception{
		assertEquals("abcd",calcu.LeerArchivo("prueba.txt")); //Leer correctamente 
	}

}
