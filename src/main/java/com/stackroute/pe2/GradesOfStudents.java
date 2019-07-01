package com.stackroute.pe2;


import java.util.Arrays;
import java.util.Collections;

public class GradesOfStudents {
    public static String gradeInput(int NumberOfStudent, int[] Grades)
    {
        if(NumberOfStudent<0  || NumberOfStudent >100)
            return "Data is wrong";

        if(Grades.length!=NumberOfStudent)
        {
            return "Wrong data";
        }

        for (int i =0;i<NumberOfStudent;i++)
        {
            if(Grades[i]<0 || Grades[i]>100)
            {
                return "Wrong grades";
            }
        }

        String output="";

        double total=0;

        for (int i =0;i<NumberOfStudent;i++)
        {
            total = total + Grades[i];
        }

        String avg = avg(total,NumberOfStudent);

        int min = min(Grades,NumberOfStudent);
        int max = max(Grades,NumberOfStudent);

        output = " Average  "+avg+" Minimum  "+min+"  Maximum  "+max;

        return output;
    }

    public static String avg(double total,int N){

        String result="";
        return result+(total/N);
    }

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