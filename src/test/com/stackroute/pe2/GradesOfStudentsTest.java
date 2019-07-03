package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class GradesOfStudentsTest {
    GradesOfStudents studentGrades=new GradesOfStudents();

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenNumberofstudentgradesShouldReturnGradesvalueswithAverageMinMax() {
        int Grades[] = {65, 75, 98, 89, 66};
        String Result = studentGrades.gradeInput(5, Grades);
        assertEquals(" Average  78.6 Minimum  65  Maximum  98", Result);
    }

    @Test
    public void givenNumberOfstudentsAndGradesNotMatchedandShouldReturnWrongData()
    {
        int Grades[] = {76,88,76};
        String Result = studentGrades.gradeInput(10,Grades);
        assertNotEquals("data",Result);
    }

    @Test
    public void givenNumberShouldReturnStudentInputIsWrong()
    {
        int Grades[] = {55,89,177,99};
        String Result = studentGrades.gradeInput(4,Grades);
        assertEquals("Wrong grades",Result);
    }


}