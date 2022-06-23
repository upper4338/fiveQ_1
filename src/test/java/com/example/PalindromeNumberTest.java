package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        assertEquals(true, PalindromeNumber.isPalindrome(121));
        assertEquals(true, PalindromeNumber.isPalindrome(1234554321));
        assertEquals(true, PalindromeNumber.isPalindrome(420024));
        assertEquals(false, PalindromeNumber.isPalindrome(420124));
        assertEquals(false, PalindromeNumber.isPalindrome(-121));
        assertEquals(false, PalindromeNumber.isPalindrome(10));
    }

}
