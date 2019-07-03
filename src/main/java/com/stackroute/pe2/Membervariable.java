package com.stackroute.pe2;


public class Membervariable{
    String name;
    int age;
    //Initialize a double variable
    double salary;
    //Initialize a empty string
    String result="";
    public String set(String name,int age,double salary)
    {
        //assign the values to variables
        name=name;
        age=age;
        salary=salary;
        //Add name to result
        result=result+"Members Name: "+name+"\n";
        //Add age to result
        result=result+"Members Age: "+age+"\n";
        //Add salary to result
        result=result+"Members Salary: "+salary+"\n";
        return result;
    }

}
