package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringArraysAreEqualTest {

    @Test
    void arrayStringsAreEqual() {
        String[] arr1 = {"ab", "c"};
        String[] arr2 = {"a", "bc"};
        assertEquals(true, StringArraysAreEqual.arrayStringsAreEqual(arr1, arr2));

        String[] arr3 = {"a", "cb"};
        String[] arr4 = {"ab", "c"};
        assertEquals(false, StringArraysAreEqual.arrayStringsAreEqual(arr3, arr4));

        String[] arr5 = {"abc", "d", "defg"};
        String[] arr6 = {"abcddefg"};
        assertEquals(true, StringArraysAreEqual.arrayStringsAreEqual(arr5, arr6));
    }

}
