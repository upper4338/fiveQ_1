package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueIntegerZeroSumTest {
    @Test
    void sumZero_SumIsZero() {
        int[] arr1 = UniqueIntegerZeroSum.sumZero(5);
        assertTrue(UniqueIntegerZeroSum.isSumZero(arr1));

        int[] arr2 = UniqueIntegerZeroSum.sumZero(3);
        assertTrue(UniqueIntegerZeroSum.isSumZero(arr2));

        int[] arr3 = UniqueIntegerZeroSum.sumZero(1);
        assertTrue(UniqueIntegerZeroSum.isSumZero(arr3));

        int[] arr4 = UniqueIntegerZeroSum.sumZero(4);
        assertTrue(UniqueIntegerZeroSum.isSumZero(arr4));
    }

    @Test
    void sumZero_ArrayIsDistinct() {
        int[] arr1 = UniqueIntegerZeroSum.sumZero(5);
        assertTrue(UniqueIntegerZeroSum.isDistinct(arr1));

        int[] arr2 = UniqueIntegerZeroSum.sumZero(3);
        assertTrue(UniqueIntegerZeroSum.isDistinct(arr2));

        int[] arr3 = UniqueIntegerZeroSum.sumZero(1);
        assertTrue(UniqueIntegerZeroSum.isDistinct(arr3));

        int[] arr4 = UniqueIntegerZeroSum.sumZero(4);
        assertTrue(UniqueIntegerZeroSum.isDistinct(arr4));
    }

    @Test
    void sumZero_LengthEqualsToArgumentValue() {
        int[] arr1 = UniqueIntegerZeroSum.sumZero(5);
        assertEquals(5, arr1.length);

        int[] arr2 = UniqueIntegerZeroSum.sumZero(3);
        assertEquals(3, arr2.length);

        int[] arr3 = UniqueIntegerZeroSum.sumZero(1);
        assertEquals(1, arr3.length);

        int[] arr4 = UniqueIntegerZeroSum.sumZero(4);
        assertEquals(4, arr4.length);
    }

    @Test
    void isSumZero() {
        int[] arr1 = {1, 0, -1};
        assertTrue(UniqueIntegerZeroSum.isSumZero(arr1));

        int[] arr2 = {1, 0, -1, 2};
        assertFalse(UniqueIntegerZeroSum.isSumZero(arr2));

        int[] arr3 = {1, 0, 2};
        assertFalse(UniqueIntegerZeroSum.isSumZero(arr3));

        int[] arr4 = {-7,-1,1,3,4};
        assertTrue(UniqueIntegerZeroSum.isSumZero(arr4));

        int[] arr5 = {-1, 0, 1};
        assertTrue(UniqueIntegerZeroSum.isSumZero(arr5));

        int[] arr6 = {0};
        assertTrue(UniqueIntegerZeroSum.isSumZero(arr6));
    }

    @Test
    void isDistinct() {
        int[] arr1 = {1, 2, 3, 4};
        assertTrue(UniqueIntegerZeroSum.isDistinct(arr1));

        int[] arr2 = {-1, 0, 1};
        assertTrue(UniqueIntegerZeroSum.isDistinct(arr2));

        int[] arr3 = {-1, 0, 1, 5, 25, 52};
        assertTrue(UniqueIntegerZeroSum.isDistinct(arr3));

        int[] arr4 = {1, 2, 3, 4, 4};
        assertFalse(UniqueIntegerZeroSum.isDistinct(arr4));

        int[] arr5 = {0, 0};
        assertFalse(UniqueIntegerZeroSum.isDistinct(arr5));

        int[] arr6 = {-1, 0, 1, -1, 2, 3};
        assertFalse(UniqueIntegerZeroSum.isDistinct(arr6));
    }
}
