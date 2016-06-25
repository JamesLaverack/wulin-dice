package com.jameslaverack.wulindice

import java.util.*

fun roll_dice(numberOfDice: Int) : Collection<Int> {
    val rng = Random()
    var dice = mutableListOf<Int>()
    for (i in 1..numberOfDice) {
        dice.add(rng.nextInt(10))
    }
    return dice
}

fun avg_roll(poolSize: Int) : Double {
    val rolls = mutableListOf<Int>()
    for (i in 1..100000) {
        rolls.add(best_set(roll_dice(poolSize)))
    }
    return rolls.average()
}

fun main(args: Array<String>) {
    for (i in 1..11) {
        print(i)
        print(" : ")
        print(avg_roll(i))
        print("\n")
    }
}
