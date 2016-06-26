package com.jameslaverack.wulindice

import java.util.*

fun roll_dice(numberOfDice: Int) : List<Int> {
    val rng = Random()
    var dice = mutableListOf<Int>()
    for (i in 1..numberOfDice) {
        dice.add(rng.nextInt(10))
    }
    return dice
}
