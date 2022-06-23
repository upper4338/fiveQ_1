package com.example;

import java.util.HashSet;
import java.util.Set;

// 1304. Find N Unique Integers Sum up to Zero
public class UniqueIntegerZeroSum {
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        boolean isOdd = n % 2 == 1;

        for (int i = 0; i < result.length / 2; i++) {
            int value = i + 1;
            result[i] = value;
            result[result.length - i - 1] = value * -1;
        }

        if (isOdd)
            result[result.length / 2] = 0;

        return result;
    }

    public static boolean isSumZero(int[] arr) {
        int sum = 0;
        for (int it : arr)
            sum += it;
        return sum == 0;
    }

    public static boolean isDistinct(int[] arr) {
        Set<Integer> valuesSet = new HashSet();
        for (int it : arr) {
            if (valuesSet.contains(it))
                return false;
            valuesSet.add(it);
        }
        return true;
    }
}
