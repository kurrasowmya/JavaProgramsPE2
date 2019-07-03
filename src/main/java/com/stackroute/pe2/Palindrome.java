package com.stackroute.pe2;

public class Palindrome {
    public static String palindromecheck(String original)
    {
        //Initialize a empty string
        String reverse = "";
        int length = original.length();
        if(original!="") {
            //loop to reverse a number
            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + original.charAt(i);
            //Compare the original and reversed number
            if (original.equals(reverse)) {
                return "String is a palindrome";
            } else {
                return "Not a palidrome";
            }
        }
        //If the string is empty print a message
        else{
            return "emptystring";
        }
    }
}
