package com.stackroute.pe2;

public class EvenNumberCheck {
    //Write isEven method
    public boolean isEven(int number)
    {
        //Check number is graeater than zero or not
        if(number>0) {
            //Check number is divisible by 2 or not
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
        //If number less then zero
        else
        {
            return false;
        }
        }
    }

