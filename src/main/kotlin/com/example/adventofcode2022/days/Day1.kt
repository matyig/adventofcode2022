package com.example.adventofcode2022.days

import org.springframework.stereotype.Component

@Component
class Day1 : Day {

    fun List<String>.toLongOrNullList(): List<Long?> =
        this.map { it.toLongOrNull() }

    fun List<Long?>.splitToSubLists(): Array<List<Long>> {
        var subLists = arrayOf(listOf<Long>())
        var index = 0
        this.forEach {
            if (it == null) {
                ++ index
                subLists += listOf<Long>()
            } else {
                subLists[index] = subLists[index].plus(it)
            }
        }
        return subLists
    }

    fun Array<List<Long>>.getMostCalories() : Long =
        this.map { it.sum() }.max()

    fun Array<List<Long>>.getSumOfMostThreeCalories() : Long =
        this.map { it.sum() }
            .sorted()
            .reversed()
            .take(3)
            .sum()

    override fun part1(input: List<String>): Long =
        input.toLongOrNullList()
            .splitToSubLists()
            .getMostCalories()

    override fun part2(input: List<String>): Long =
        input.toLongOrNullList()
            .splitToSubLists()
            .getSumOfMostThreeCalories()

}
