package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenStringShouldReturnPalindrome(){
        //arrange
        Palindrom palindrome=new Palindrom();
        //Act
        String result= palindrome.palindromecheck("abba");
        //Assert
        assertEquals("String is a palindrome",result);
    }
    @Test
    public void givenStringShouldReturnNullString(){
        //arrange
        Palindrom palindrome=new Palindrom();
        //Act
        String result= palindrome.palindromecheck("");
        //Assert
        assertEquals("String is a palindrome",result);
    }
    @Test
    public void givenStringShouldReturnNullPalindromeWithSpaces() {
        //arrange
        Palindrom palindrome = new Palindrom();
        //Act
        String result = palindrome.palindromecheck("ABCD DCBA");
        //Assert
        assertEquals("String is a palindrome", result);

    }
    @Test
    public void givenStringShouldReturnNotaPalindrome() {
        //arrange
        Palindrom palindrome = new Palindrom();
        //Act
        String result = palindrome.palindromecheck("stackroute");
        //Assert
        assertEquals("Not a palidrome", result);

    }

}