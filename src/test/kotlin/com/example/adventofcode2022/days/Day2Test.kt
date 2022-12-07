package com.example.adventofcode2022.days

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class Day2Test {

    val day2 = Day2()

    val strategyGuide = listOf(
        "A Y",
        "B X",
        "C Z"
    )

    @Test
    fun part1() {
        val expected = 15L
        val result = day2.part1(strategyGuide)
        assertEquals(expected, result)
    }

    @Test
    fun part2() {
        val expected = 12L
        val result = day2.part2(strategyGuide)
        assertEquals(expected, result)
    }
}
