package com.jameslaverack.wulindice

import java.util.*

/**
 * Iterates over all possible results of a given type of dice pool.
 */
class DiceIterator<T>(val numberOfDice: Int, val faces: List<T>) : Iterator<List<T>> {

    var indexes = ArrayList<Int>()
    var done = false

    init {
        for (i in 1..numberOfDice) {
            indexes.add(0)
        }
    }

    fun increment() {
        bump(numberOfDice - 1)
    }

    fun bump(index: Int) {
        // Don't permit negative indexing
        if (index < 0) {
            done = true
            return
        }
        var digit = indexes[index] + 1
        if (digit == faces.size) {
            indexes[index] = 0;
            bump(index - 1);
        } else {
            indexes[index] = digit;
        }
    }

    override fun next(): List<T> {
        var previousPool = toPool();
        increment();
        return previousPool
    }

    fun toPool(): List<T> {
        var pool = mutableListOf<T>()
        for (index in indexes) {
            pool.add(faces[index])
        }
        return pool
    }

    override fun hasNext(): Boolean {
        return !done
    }
}
