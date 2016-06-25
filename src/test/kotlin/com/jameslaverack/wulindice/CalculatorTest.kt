package com.jameslaverack.wulindice

import kotlin.test.*

import org.junit.Test as test

class CalculatorTest {
    @test fun bucket() {
        val buckets = bucket_dice(listOf(1, 1, 3))
        assertEquals(2, buckets[1])
        assertEquals(1, buckets[3])
    }
}