/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupoceep.dam1.pruebajunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author smlar
 */
public class PruebasTest {

    public PruebasTest() {
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
     * Test of elevaCuadrado method, of class Pruebas.
     */
    @Test
    public void testElevaCuadrado() {
        System.out.println("elevaCuadrado");
        Pruebas instance = new Pruebas();

        Integer num = 2;
        Integer expResult = 4;

        Integer result = instance.elevaCuadrado(num);
        assertEquals(expResult, result);

        num = 3;
        expResult = 9;
        result = instance.elevaCuadrado(num);
        assertEquals(expResult, result);
    }

}
