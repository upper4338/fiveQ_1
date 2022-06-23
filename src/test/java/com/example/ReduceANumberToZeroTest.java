package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReduceANumberToZeroTest {
    @Test
    void numberOfSteps() {
        assertEquals(6, ReduceANumberToZero.numberOfSteps(14));
        assertEquals(4, ReduceANumberToZero.numberOfSteps(8));
        assertEquals(12, ReduceANumberToZero.numberOfSteps(123));
    }
}
