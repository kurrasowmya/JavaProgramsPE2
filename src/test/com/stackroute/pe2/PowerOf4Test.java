package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenNumbershouldReturnTrue() {

        //arrange
        PowerOfFour power = new PowerOfFour();
        //Act
        boolean result = power.poweroffour(64);
        //Assert
        assertEquals(true, result);
    }
    @Test
    public void givenNumbershouldReturnFalse() {

        //arrange
        PowerOfFour power = new PowerOfFour();
        //Act
        boolean result = power.poweroffour(14);
        //Assert
        assertEquals(false, result);
    }
    @Test
    public void givenNumbershouldReturnFalseForZero() {

        //arrange
        PowerOfFour power = new PowerOfFour();
        //Act
        boolean result = power.poweroffour(0);
        //Assert
        assertEquals(false, result);
    }
    @Test
    public void givenNumbershouldReturnFalseForNegativeNumber() {

        //arrange
        PowerOfFour power = new PowerOfFour();
        //Act
        boolean result = power.poweroffour(-64);
        //Assert
        assertEquals(false, result);
    }

}