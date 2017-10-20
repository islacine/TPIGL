/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YacineMestoui
 */
public class VectorHelperIT {
    
    public VectorHelperIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tri method, of class VectorHelper.
     */
    @Test
    public void testTri() {
        System.out.println("tri");
        int[] vector =  {5,14,20,-20,0,1,50,180,21};
        VectorHelper instance = new VectorHelper();
        int[] expResult = {-20,0,1,5,14,20,21,50,180};
        int[] result = instance.tri(vector);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of Somme method, of class VectorHelper.
     */
    @Test
    public void testSomme() throws LengthException {
        System.out.println("Somme");
        int[] vector1 = {5,14,20,-20,0,1,50,180,20};
        int[] vector2 = {14,02,-20,-9,14,18,7,57,2};
        VectorHelper instance = new VectorHelper();
        int[] expResult = {19,16,0,-29,14,19,57,237,22};
        try {
            int[] result = instance.Somme(vector1, vector2);
            assertArrayEquals(expResult, result);
        } catch (LengthException e) {
              e.printStackTrace();
        }
        
    }

    /**
     * Test of InverserVector method, of class VectorHelper.
     */
    @Test
    public void testInverserVector() {
        System.out.println("InverserVector");
        int[] vector = {19,16,0,-29,14,19,57,237,22};;
        VectorHelper instance = new VectorHelper();
        int[] expResult = {22,237,57,19,14,-29,0,16,19};
        int[] result = instance.InverserVector(vector);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of MinMax method, of class VectorHelper.
     */
    @Test
    public void testMinMax() {
        System.out.println("MinMax");
        int[] vector = {19,16,0,-29,14,19,57,237,22};
        VectorHelper instance = new VectorHelper();
        int expResultmin = -29 ;
        int expResultmax = 237 ;
        instance.MinMax(vector);
        assertEquals(expResultmin, instance.min);
         assertEquals(expResultmax, instance.max);
    }

    /**
     * Test of Formule method, of class VectorHelper.
     */
    @Test
    public void testFormule() {
        System.out.println("Formule");
        int[] vector = {19,16,0,-29,14,19,57,237,22};
        VectorHelper instance = new VectorHelper();
        int[] expResult = {19*19,16*16,0*0,29*29,14*14,19*19,57*57,237*237,22*22};
        int[] result = instance.Formule(vector);
        assertArrayEquals(expResult, result);
        
    }

    
    
}
