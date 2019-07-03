package com.stackroute.pe2;


import java.util.Arrays;
import java.util.Collections;

public class GradesOfStudents {
    //Method to read grades and value of numberofstudent
    public static String gradeInput(int NumberOfStudent, int[] Grades)
    {
        //Check whether number of students greater than zero or not
        if(NumberOfStudent<0  || NumberOfStudent >100)
            return "Data is wrong";
        //Check whether length equals numberofstudents
        if(Grades.length!=NumberOfStudent)
        {
            return "Wrong data";
        }
        //Iterate the grades and stop if error exceeds 100 or not
        for (int i =0;i<NumberOfStudent;i++)
        {
            if(Grades[i]<0 || Grades[i]>100)
            {
                return "Wrong grades";
            }
        }
        //Initialize a empty string
        String output="";

        double total=0;
        //Iterate and get total sum of grades entered
        for (int i =0;i<NumberOfStudent;i++)
        {
            total = total + Grades[i];
        }
        //Call the average method
        String avg = avg(total,NumberOfStudent);
        //Call the min method
        int min = min(Grades,NumberOfStudent);
        //Call the max method
        int max = max(Grades,NumberOfStudent);

        output = " Average  "+avg+" Minimum  "+min+"  Maximum  "+max;
        //return the output
        return output;
    }
    //Method to calculate the average of grades
    public static String avg(double total,int N){

        String result="";
        return result+(total/N);
    }
    //Method to calculate minimum value
    public static int min(int[] NGrades, int count)
    {
        int minimum= NGrades[0];
        for (int i=1;i<count;i++)
        {
            if(NGrades[i]<minimum)
            {
                minimum = NGrades[i];
            }
        }

        return minimum;
    }
    //Method to calculate maximum value
    public static int max(int[] Grades, int count)
    {
        int maximum= Grades[0];
        for (int i=1;i<count;i++)
        {
            if(Grades[i]>maximum)
            {
                maximum = Grades[i];
            }
        }

        return maximum;
    }


}