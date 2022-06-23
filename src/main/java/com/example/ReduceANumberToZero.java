package com.example;

// 1342. Number of Steps to Reduce a Number to Zero
public class ReduceANumberToZero {
    public static int numberOfSteps(int num) {
        int counter = 0;
        while (num != 0) {
            counter++;
            if (num % 2 == 0)
                num /= 2;
            else
                num -= 1;
        }
        return counter;
    }
}
