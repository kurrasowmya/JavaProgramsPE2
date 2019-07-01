package com.stackroute.pe2;

public class PowerOfFour {
    public boolean powerfour(int number) {
        if(number == 0)
            return false;
        while(number != 1)
        {
            if(number % 4 != 0)
                return false;
            number = number / 4;
        }
        return true;
    }
}

