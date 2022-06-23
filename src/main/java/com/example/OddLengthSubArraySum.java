package com.example;

import java.util.Arrays;

// 1588. Sum of All Odd Length SubArrays
public class OddLengthSubArraySum {
    public static int sumOddLengthSubArrays(int[] arr) {
        int total = 0;
        for (int i = arr.length; i > 0; i--)
            if (i % 2 == 1)
                for (int j = 0; j < arr.length - i + 1; j++)
                    total += calculateArraySum(Arrays.copyOfRange(arr, j, j + i));
        return total;
    }

    private static int calculateArraySum(int[] arr) {
        int sum = 0;
        for (int val : arr)
            sum += val;
        return sum;
    }

}
