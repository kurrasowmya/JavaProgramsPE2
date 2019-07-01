package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCheckTest {
    EvenNumberCheck obj;

    @Before
    public void setUp() throws Exception {
        obj=new EvenNumberCheck();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void givenevenNumberisCheckedanditshouldReturnTrue()
    {
        boolean result=obj.isEven(2648);
        assertEquals(true,result);
    }
    @Test
    public void givenoddNumberisCheckedanditshouldreturnFalse()
    {
        boolean result=obj.isEven(2643);
        assertNotEquals(true,result);
    }
    @Test
    public void givenNumberwhichisLessthanZeroisCheckedanditReturnsfalse()
    {
        boolean result=obj.isEven(-23);
        assertNotEquals(true,result);
    }
    @Test
    public void givenzeroNumberisCheckedanditShoulsreturnfalse()
    {
        boolean result=obj.isEven(0);
        assertNotEquals(true,result);
    }





}