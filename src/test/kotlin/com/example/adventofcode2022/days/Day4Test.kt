package com.example.adventofcode2022.days

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class Day4Test {

    val day4 = Day4()

    val sections = listOf(
        "2-4,6-8",
        "2-3,4-5",
        "5-7,7-9",
        "2-8,3-7",
        "6-6,4-6",
        "2-6,4-8"
    )

    @Test
    fun part1() {
        val expect = 2L
        val result = day4.part1(sections)
        assertEquals(expect, result)
    }

    @Test
    fun part2() {
        val expect = 4L
        val result = day4.part2(sections)
        assertEquals(expect, result)
    }
}
