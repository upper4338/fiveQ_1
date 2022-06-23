package com.example;

// 1528. Shuffle String
public class ShuffleString {
    public static String shuffleString(String s, int[] indices) {
        StringBuilder output = new StringBuilder();
        int[] reversedIndices = new int[indices.length];
        for (int i = 0; i < indices.length; i++)
            reversedIndices[indices[i]] = i;

        for (int reversedIndex : reversedIndices)
            output.append(s.charAt(reversedIndex));

        return output.toString();
    }

}
