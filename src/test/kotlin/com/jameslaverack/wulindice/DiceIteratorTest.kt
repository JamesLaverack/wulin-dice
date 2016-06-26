package com.jameslaverack.wulindice

import kotlin.test.*

import org.junit.Test as test

class DiceIteratorTest {
    @test fun firstResult() {
        val iterator = DiceIterator(2, (1..6).toList());
        // In this case we're rolling dice numbered 1 to 6. So
        // the first number will be 1 and not 0.
        assertEquals(listOf(1, 1), iterator.next());
    }

    @test fun lettersExhaustive() {
        val iterator = DiceIterator(2, listOf('A', 'B', 'C'));
        assertEquals(listOf('A', 'A'), iterator.next());
        assertEquals(listOf('A', 'B'), iterator.next());
        assertEquals(listOf('A', 'C'), iterator.next());
        assertEquals(listOf('B', 'A'), iterator.next());
        assertEquals(listOf('B', 'B'), iterator.next());
        assertEquals(listOf('B', 'C'), iterator.next());
        assertEquals(listOf('C', 'A'), iterator.next());
        assertEquals(listOf('C', 'B'), iterator.next());
        assertEquals(listOf('C', 'C'), iterator.next());
        assertFalse(iterator.hasNext())
    }

    @test fun hasNextWorks() {
        val iterator = DiceIterator(6, (0..9).toList());
        var count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++
        }
        // Six ten-sided dice results in 10^6 (1 million) possibilities
        assertEquals(1000000, count)
    }
}
