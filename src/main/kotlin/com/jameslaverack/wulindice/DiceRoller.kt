package com.jameslaverack.wulindice

fun avg_roll(poolSize: Int) : Double {
    var runningTotal: Long = 0;
    var count = 0;
    for (roll in DiceIterator(poolSize, (0..9).toList())) {
        runningTotal += best_set(roll)
        count++
    }
    return runningTotal.toDouble() / count.toDouble()
}

fun main(args: Array<String>) {
    for (i in 1..11) {
        print(i)
        print(" : ")
        print(avg_roll(i))
        print("\n")
    }
}
