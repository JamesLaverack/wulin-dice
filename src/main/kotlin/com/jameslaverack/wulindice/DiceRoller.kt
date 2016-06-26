package com.jameslaverack.wulindice

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
