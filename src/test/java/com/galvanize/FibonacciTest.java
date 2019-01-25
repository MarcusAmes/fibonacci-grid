package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    void runBefore() {
        fibonacci = new Fibonacci();
    }


    @Test
    void SeriesTest() {
        assertEquals(Arrays.toString(new int[]{0}), Arrays.toString(fibonacci.series(new String[]{"1", "1"}).toArray()));
        assertEquals(Arrays.toString(new int[]{0,1,1,2}), Arrays.toString(fibonacci.series(new String[]{"2", "2"}).toArray()));
        assertEquals(Arrays.toString(new int[]{0,1,1,2,3,5,8,13}), Arrays.toString(fibonacci.series(new String[]{"2", "4"}).toArray()));
        assertEquals(Arrays.toString(new int[]{0,1,1,2,3,5,8,13,21}), Arrays.toString(fibonacci.series(new String[]{"1", "9"}).toArray()));
    }
}
