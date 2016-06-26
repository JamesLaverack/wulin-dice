package com.jameslaverack.wulindice

import kotlin.test.*

import org.junit.Test as test

class DiceIteratorTest {
    @test fun firstResultIsZero() {
        val iterator = DiceIterator(2, (1..6).toList());
        assertEquals(listOf(1, 1), iterator.next());
    }

    @test fun hasNextWorks() {
        val iterator = DiceIterator(1, listOf('A', 'B', 'C', 'D'));
        var count = 0;
        while (iterator.hasNext()) {
            println(iterator.next());
            count++
        }
        assertEquals(4, count)
    }
}
