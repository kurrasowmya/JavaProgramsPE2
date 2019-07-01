package com.stackroute.pe2;

public class Palindrom {
    public static String palindromecheck(String original)
    {
        String reverse = "";
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)){
            return "String is a palindrome";
        }

        else {
            return "Not a palidrome";
        }
    }
}
