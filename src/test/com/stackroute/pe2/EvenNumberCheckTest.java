package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCheckTest {
    EvenNumberCheck obj=new EvenNumberCheck();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenevenNumberisCheckedandReturnsBoolean()
    {
        boolean result=obj.isEven(2648);
        assertEquals(true,result);
    }
    @Test
    public void givenoddNumberisCheckedandReturnsBoolean()
    {
        boolean result=obj.isEven(2643);
        assertNotEquals(true,result);
    }



}