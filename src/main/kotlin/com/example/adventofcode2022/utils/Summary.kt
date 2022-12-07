package com.example.adventofcode2022.utils

import com.example.adventofcode2022.days.Day
import org.springframework.stereotype.Component

@Component
class Summary(
    private val dayList: List<Day>,
    private val inputParser: InputParser) {

    fun displaySolutions() {
        dayList.forEach {
            val dayInput = inputParser.getInputData(it)
            println( it.javaClass.simpleName +  " " + it.part1(dayInput) + " " + it.part2(dayInput))
        }
    }

}
