package com.jameslaverack.wulindice

import java.util.*

/*
 * For a given collection of dice, determine the best result possible.
 * <p>
 * For example: [1, 2, 3, 3, 1] has a best set of the pair of threes. Resulting in 23.
 */
fun calculate_best_set(dice: Collection<Int>): Int {
    return 2
}

fun bucket_dice(dice: Collection<Int>) : Map<Int, Int> {
    var buckets = hashMapOf<Int, Int>().withDefault({0})
    dice.forEach({buckets[it] = buckets[it]!!.plus(1)})
    return buckets
}