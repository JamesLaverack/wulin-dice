package com.jameslaverack.wulindice

import kotlin.test.*

import org.junit.Test as test

class CalculatorTest {
    @test fun double() {
        assertEquals(23, best_set(listOf(2, 3, 4, 0, 9, 3)))
    }

    /*
     * This tests that only the *biggest* set is found. In this case
     * we have triple 1's and double 3's.
     */
    @test fun tripleAndDouble() {
        assertEquals(31, best_set(listOf(1, 3, 1, 0, 1, 3)))
    }

    @test fun single() {
        assertEquals(15, best_set(listOf(5, 3, 4, 0, 2, 1)))
    }

    @test fun none() {
        assertEquals(0, best_set(listOf()));
    }

}
