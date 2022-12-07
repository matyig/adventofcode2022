package com.example.adventofcode2022.days

import org.springframework.stereotype.Component

@Component
class Day3 : Day {

    fun String.splitAtIndex(index: Int) =
        take(index) to substring(index)

    fun Pair<String, String>.intersectedChar(): Char =
        this.first.toSet()
            .intersect(this.second.toSet())
            .first()

    fun List<String>.intersectedChar(): Char =
        this[0].toSet()
            .intersect(this[1].toSet())
            .intersect(this[2].toSet())
            .first()

    fun String.getCommonItem() : Char =
        this.splitAtIndex(this.length / 2)
            .intersectedChar()

    fun Char.getPriority() : Int =
        when (this) {
            in 'a'..'z' -> this.code - 96
            in 'A'..'Z' -> this.code - 38
            else -> 0
        }

    fun List<String>.getSumOfPriorites() : Long =
        this.map { it.getCommonItem() }
            .sumOf { it.getPriority() }
            .toLong()

    fun List<String>.getSumOfPrioritesAdvanced() : Long =
        this.chunked(3)
            .map { it.intersectedChar() }
            .sumOf { it.getPriority() }
            .toLong()

    override fun part1(input: List<String>): Long =
        input.getSumOfPriorites()

    override fun part2(input: List<String>): Long =
        input.getSumOfPrioritesAdvanced()

}
