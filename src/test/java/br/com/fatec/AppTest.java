package br.com.fatec;

import org.junit.Test;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
	@Test
    public void testSoma()
    {
		Calculadora calc = new Calculadora();
        assertTrue(calc.soma() == 2);
    }
}
