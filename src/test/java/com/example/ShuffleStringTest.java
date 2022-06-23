package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShuffleStringTest {

    @Test
    void shuffleString() {
        int[] indices = {4,5,6,7,0,2,1,3};
        assertEquals("leetcode", ShuffleString.shuffleString("codeleet", indices));
        int[] indices2 = {0,1,2};
        assertEquals("abc", ShuffleString.shuffleString("abc", indices2));
    }

}
