package com.example.adventofcode2022.days

import org.springframework.stereotype.Component
import org.w3c.dom.ranges.Range

@Component
class Day4 : Day {

    fun List<String>.toRangePairList(): List<Pair<IntRange, IntRange>> =
        this.map { line -> line.split(",") }
            .filter { sections  -> sections.size == 2 }
            .map { sections ->
                sections.map { section -> section.split("-") }
                    .filter { nums -> nums.size == 2 }
                    .map { nums ->IntRange(nums[0].toInt(), nums[1].toInt()) }
            }
            .map { range -> Pair(range[0], range[1])}

    fun Pair<IntRange, IntRange>.isFullyOverlaps() : Boolean =
        this.first.intersect(this.second).size == minOf(this.first.count(), this.second.count())

    fun Pair<IntRange, IntRange>.isPartiallyOverlaps() : Boolean =
        this.first.intersect(this.second).isNotEmpty()

    override fun part1(input: List<String>): Long =
        input.toRangePairList()
            .filter { it.isFullyOverlaps()}
            .size
            .toLong()

    override fun part2(input: List<String>): Long =
        input.toRangePairList()
            .filter { it.isPartiallyOverlaps()}
            .size
            .toLong()
}
