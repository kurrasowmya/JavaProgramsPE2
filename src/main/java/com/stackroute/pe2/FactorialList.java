package com.stackroute.pe2;

import java.math.BigDecimal;

public class FactorialList {
    //Method for calculating factorial
    public static void intfactorial() {
        //Initialize a long Variable
        long result = 0;
        int number=8, count=0;
        //Iterate until we get the entered number
        while (count < number) {
            for (int i = 1; i <= number; i++) {
                result = result * i;

            }
            count++;

        }
    }

}
