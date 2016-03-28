/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecme.algorithms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emercado
 */
public class AngryProfessorTest {
    
    public AngryProfessorTest() {
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
     * Test of executeTest method, of class AngryProfessor.
     */
    @Test
    public void testExecuteTest() {
        System.out.println("executeTest");
        AngryProfessor instance = new AngryProfessor();
       
        // TODO review the generated test code and remove the default call to fail.
         assertTrue(instance.executeTest());
    }
    
}
