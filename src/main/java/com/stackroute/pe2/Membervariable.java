package com.stackroute.pe2;


public class Membervariable{
    String name;
    int age;
    double salary;
    String result="";
    public String set(String name,int age,double salary)
    {
        name=name;
        age=age;
        salary=salary;
        result=result+"Members Name: "+name+"\n";
        result=result+"Members Age: "+age+"\n";
        result=result+"Members Salary: "+salary+"\n";
        System.out.println(result);
        return result;
    }

}
