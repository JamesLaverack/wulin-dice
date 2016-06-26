package com.jameslaverack.wulindice

fun avg_roll(poolSize: Int) : Double {
    val rolls = mutableListOf<Int>()
    for (roll in DiceIterator(poolSize, (0..9).toList())) {
        rolls.add(best_set(roll))
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
