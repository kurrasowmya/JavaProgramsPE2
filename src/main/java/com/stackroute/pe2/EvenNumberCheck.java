package com.stackroute.pe2;

public class EvenNumberCheck {
    public boolean isEven(int number)
    {
        if(number>0) {
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
        else
        {
            return false;
        }
        }
    }

