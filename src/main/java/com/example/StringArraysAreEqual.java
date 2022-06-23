package com.example;

// 1662. Check If Two String Arrays are Equivalent
public class StringArraysAreEqual {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String concatenatedWord1 = concatenateArrayStrings(word1);
        String concatenatedWord2 = concatenateArrayStrings(word2);
        return concatenatedWord1.equals(concatenatedWord2);
    }

    private static String concatenateArrayStrings(String[] words) {
        StringBuilder output = new StringBuilder();
        for (String word: words)
            output.append(word);
        return output.toString();
    }
}
