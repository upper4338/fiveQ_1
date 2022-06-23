package com.example;

// 9. Palindrome Number
public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);
        int numberLength = numberString.length();

        for (int i = 0; i < numberLength / 2; i++)
            if (numberString.charAt(i) != numberString.charAt(numberLength - i - 1))
                return false;
        return true;
    }
}
