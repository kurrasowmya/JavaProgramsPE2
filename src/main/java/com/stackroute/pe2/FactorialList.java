package com.stackroute.pe2;

import java.math.BigDecimal;

public class FactorialList {
    public static void intfactorial() {
        long result = 0;
        int n=8, count=0;
        while (count < n) {
            for (int i = 1; i <= n; i++) {
                result = result * i;

            }
            count++;
            System.out.println("factorial of" + count +"is" + result);

        }
    }

}
