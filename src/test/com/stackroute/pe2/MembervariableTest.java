package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MembervariableTest {
    Membervariable obj;
    @org.junit.Before
    public void setUp() throws Exception {
        obj=new Membervariable();

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    @Test
    public void setDetailsOfMembers() {
        String result=obj.set("Sweety",21,40400.00);
        assertEquals("Members Name: Sweety\nMembers Age: 21\nMembers Salary: 40400.0\n",result);

    }
    @Test
    public void setDetailsOfMember2() {
        String result2=obj.set("Pinky",19,50000.00);
        assertEquals("Members Name: Pinky\nMembers Age: 19\nMembers Salary: 50000.0\n",result2);

    }
}