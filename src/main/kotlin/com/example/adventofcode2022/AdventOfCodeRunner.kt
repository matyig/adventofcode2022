package com.example.adventofcode2022

import com.example.adventofcode2022.utils.Summary
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class AdventOfCodeRunner : CommandLineRunner {

    @Autowired
    private val summary: Summary? = null

    override fun run(vararg args: String?) {
        summary?.displaySolutions()
    }
}
