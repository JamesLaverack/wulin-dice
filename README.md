[![Build Status](https://travis-ci.org/JamesLaverack/wulin-dice.svg?branch=master)](https://travis-ci.org/JamesLaverack/wulin-dice)

# wuilin-dice
Dice probably calculator for the Legends of the Wulin roleplaying game

## Dice Rolling

The Legends of the Wulin roleplaying game uses a rather unique dice rolling mechanic. In
it a pool of ten-sided dice are rolled. A value of "10" on a die is treated as zero, so
each die has a number from 0 to 9 inclusive.

Players then identify "sets" in the roll. A set is two or more dice with the same
number. The value of the set takes the number of dice in that set as the "tens"
digit, and the value of the number shown on the dice as the "units".

Some examples:
* Four dice showing the number 7 is a set with a value of 47.
* Two dice showing the number 0 is a set with a value of 20.
* Six dice showing the number 8 is a set with a value of 68.
* Eleven dice showing the number 3 is a set with a value of 113.

Rolls can have multiple sets. For example if you rolled seven dice you could get 1, 1, 2,
2, 2, 8. Which gives a set of three twos and a set of two ones. In most cases in the game
you care mostly about the set of the highest value. Other sets may be used in the rules,
but we're not concerned with an implementation of the Legends of the Wulin rules here.

In some cases, a single die can be used in place of a set, when doing so the usual rules
apply. As there is only one die, a "1" is used as the tens digit. So a single die showing
the number 3 has a value of 13.

## Statistics

This program is designed to calculate statistical information about rolling various. All
possible dice pools from a given pool size are calculated and then their maximum set value
taken.

For example if rolling three dice, the program will consider [0, 0, 0], then [0, 0, 1], and
so on until ending on [9, 9, 9].
