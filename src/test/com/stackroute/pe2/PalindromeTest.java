package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome obj;

    @Before
    public void setUp() throws Exception {
        obj=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenStringShouldReturnPalindrome(){

        //Act
        String result= obj.palindromecheck("madam");
        //Assert
        assertEquals("String is a palindrome",result);
    }
    @Test
    public void givenStringShouldReturnNullString(){
        //Act
        String result= obj.palindromecheck("");
        //Assert
        assertEquals("emptystring",result);
    }
    @Test
    public void givenStringShouldReturnNullPalindromeWithSpaces() {

        //Act
        String result = obj.palindromecheck("mam mam");
        //Assert
        assertEquals("String is a palindrome", result);

    }
    @Test
    public void givenStringShouldReturnNotaPalindrome() {

        //Act
        String result = obj.palindromecheck("java");
        //Assert
        assertEquals("Not a palidrome", result);

    }

}