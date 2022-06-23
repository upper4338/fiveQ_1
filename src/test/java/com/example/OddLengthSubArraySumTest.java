package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddLengthSubArraySumTest {

    @Test
    void sumOddLengthSubArrays() {
        int[] arr = {1,4,2,5,3};
        assertEquals(58, OddLengthSubArraySum.sumOddLengthSubArrays(arr));

        int[] arr2 = {1, 2};
        assertEquals(3, OddLengthSubArraySum.sumOddLengthSubArrays(arr2));

        int[] arr3 = {10,11,12};
        assertEquals(66, OddLengthSubArraySum.sumOddLengthSubArrays(arr3));
    }

}
