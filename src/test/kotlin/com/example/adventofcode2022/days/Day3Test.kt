package com.example.adventofcode2022.days

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class Day3Test {

    val day3 = Day3()

    val rucksackContent = listOf(
        "vJrwpWtwJgWrhcsFMMfFFhFp",
        "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
        "PmmdzqPrVvPwwTWBwg",
        "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
        "ttgJtRGJQctTZtZT",
        "CrZsJsPPZsGzwwsLwLmpwMDw"
    )

    @Test
    fun part1() {
        val expected = 157L
        val result = day3.part1(rucksackContent)
        assertEquals(expected, result)
    }

    @Test
    fun part2() {
        val expected = 70L
        val result = day3.part2(rucksackContent)
        assertEquals(expected, result)
    }
}
