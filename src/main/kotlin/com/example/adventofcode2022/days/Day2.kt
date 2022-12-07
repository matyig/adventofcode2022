package com.example.adventofcode2022.days

import org.springframework.stereotype.Component

@Component
class Day2 : Day {

    companion object {
        val scores = mapOf(
            // draw
            Pair('A', 'X') to 3 + 1, // rock-rock
            Pair('B', 'Y') to 3 + 2, // paper-paper
            Pair('C', 'Z') to 3 + 3, // scissor-scissor

            // you lose
            Pair('A', 'Z') to 0 + 3, // rock-scissor
            Pair('B', 'X') to 0 + 1, // paper-rock
            Pair('C', 'Y') to 0 + 2, // scissor-paper

            // you win
            Pair('A', 'Y') to 6 + 2, // rock-paper
            Pair('B', 'Z') to 6 + 3, // paper-scissor
            Pair('C', 'X') to 6 + 1, // scissor-rock
        )

        val transformRules = mapOf(

            // you win
            Pair('A', 'Z') to Pair('A', 'Y'), // rock-paper
            Pair('B', 'Z') to Pair('B', 'Z'), // paper-scissor
            Pair('C', 'Z') to Pair('C', 'X'), // scissor-rock

            // you loose
            Pair('A', 'X') to Pair('A', 'Z'), // rock-scissor
            Pair('B', 'X') to Pair('B', 'X'), // paper-rock
            Pair('C', 'X') to Pair('C', 'Y'), // scissor-paper

            // draw
            Pair('A', 'Y') to Pair('A', 'X'), // rock-rock
            Pair('B', 'Y') to Pair('B', 'Y'), // paper-paper
            Pair('C', 'Y') to Pair('C', 'Z'), // scissor-scissor
        )
    }

    fun List<String>.toCharPairList(): List<Pair<Char, Char>> {
        return this.map { it.split(" ") }
            .filter { it.size == 2 && it[0].length == 1 && it[1].length == 1 }
            .map { Pair(it[0].first(), it[1].first())}
    }

    fun List<Pair<Char, Char>>.toScores(): List<Int> {
        return this.map { scores.getOrDefault(it, 0) }
    }

    fun Pair<Char, Char>.transform() : Pair<Char, Char>? {
        return transformRules.get(this)
    }

    override fun part1(input: List<String>): Long {
        return input.toCharPairList()
            .toScores()
            .sum()
            .toLong()
    }

    override fun part2(input: List<String>): Long {
        return input.toCharPairList()
            .mapNotNull { it.transform() }
            .toScores()
            .sum()
            .toLong()
    }
}
