package com.example.adventofcode2022.days

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class Day1Test {

    val day1 = Day1()

    val calories : List<String> = listOf (
        "1000",
        "2000",
        "3000",
        "",
        "4000",
        "",
        "5000",
        "6000",
        "",
        "7000",
        "8000",
        "9000",
        "",
        "10000")

    @Test
    fun getMostCalories() {
        val expected = 24000L
        val result = day1.part1(calories)
        assertEquals(expected, result)
    }

    @Test
    fun getSumOfMostThreeCalories() {
        val expected = 45000L
        val result = day1.part2(calories)
        assertEquals(expected, result)
    }
}
