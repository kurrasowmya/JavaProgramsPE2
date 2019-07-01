package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialListTest {

    FactorialList ob=new FactorialList();
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    @Test
    public void longFactorialCheck() {
        String res=ob.longFactorial();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",res);
    }
    @Test
    public void intFactorialCheck() {
        String res=ob.intFactorial();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n",res);
    }
}