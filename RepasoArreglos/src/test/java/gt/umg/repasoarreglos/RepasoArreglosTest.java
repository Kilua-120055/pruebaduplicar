/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.repasoarreglos;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author killua
 */
public class RepasoArreglosTest {
   
    @Test
    public void testRetornoSuma() {
        System.out.println("cadena nula");
        long[] input = null;
        long[] expResult = null;
        long[] result = RepasoArreglos.retornoSuma(input);
        assertArrayEquals("resultado obtenido "+Arrays.toString(result),expResult, result);
        
    }
    
    @Test
    public void testRetornoSuma2() {
        System.out.println("cadena con un dato");
        long[] input = {1};
        long[] expResult = {1};
        long[] result = RepasoArreglos.retornoSuma(input);
        assertArrayEquals("resultado obtenido "+Arrays.toString(result),expResult, result);
        
    }
    
    @Test
    public void testRetornoSuma3() {
        System.out.println("cadena con 3 datos");
        long[] input = {1,2,3};
        long[] expResult = {5,4,3};
        long[] result = RepasoArreglos.retornoSuma(input);
        assertArrayEquals("resultado obtenido "+Arrays.toString(result),expResult, result);
        
    }
    
@Test
    public void testRetornoSuma4() {
        System.out.println("cadena nula");
        long[] input = {};
        long[] expResult = {};
        long[] result = RepasoArreglos.retornoSuma(input);
        assertArrayEquals("resultado obtenido "+Arrays.toString(result),expResult, result);
        
    }
    
    @Test
    public void testRetornoSuma5() {
        System.out.println("cadena con 2 numeros");
        long[] input = {2,3};
        long[] expResult = {3,2};
        long[] result = RepasoArreglos.retornoSuma(input);
        assertArrayEquals("resultado obtenido "+Arrays.toString(result),expResult, result);
        
    }
}
