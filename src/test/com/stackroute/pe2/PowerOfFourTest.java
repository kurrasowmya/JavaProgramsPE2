package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour fourpower;

    @Before
    public void setUp() throws Exception {
        fourpower=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        fourpower=null;
    }
    @Test
    public void givenNumberisPowerOffourAndItshouldReturnTrue() {

        //Act
        boolean result = fourpower.powerfour(16);
        //Assert
        assertEquals(true, result);
    }
    @Test
    public void givenNumberisNotAPowerOfFourAndItshouldReturnFalse() {

        //Act
        boolean result = fourpower.powerfour(21);
        //Assert
        assertEquals(false, result);
    }
    @Test
    public void givenNumberisZeroAndItshouldReturnFalse() {

        //Act
        boolean result = fourpower.powerfour(0);
        //Assert
        assertEquals(false, result);
    }
    @Test
    public void givenNumberisNegativeAndItshouldReturnFalse() {

        //Act
        boolean result =fourpower.powerfour(-4);
        //Assert
        assertNotEquals(true, result);
    }

}