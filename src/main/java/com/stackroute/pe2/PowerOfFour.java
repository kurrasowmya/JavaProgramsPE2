package com.stackroute.pe2;

public class PowerOfFour {
    //Initialize a method to check power of four
    public boolean powerfour(int number) {
        //Check whether number is greater than zero or not
        if(number == 0)
            return false;
        //Iterate untill we reach one
        while(number != 1)
        {
            if(number % 4 != 0)
                return false;
            number = number / 4;
        }
        return true;
    }
}

