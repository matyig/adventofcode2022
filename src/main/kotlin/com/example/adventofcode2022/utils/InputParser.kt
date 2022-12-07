package com.example.adventofcode2022.utils

import com.example.adventofcode2022.days.Day
import org.springframework.stereotype.Component
import java.io.File

@Component
class InputParser {

    companion object {
        const val INPUT_PATH = "./inputs/"
        const val INPUT_FILE_NAME_SUFFIX = ".txt"
    }

    fun getInputData(day: Day) : List<String> {
        val fileName = INPUT_PATH + day.javaClass.simpleName.lowercase() + INPUT_FILE_NAME_SUFFIX
        return File(fileName).useLines { it.toList() }
    }



}
