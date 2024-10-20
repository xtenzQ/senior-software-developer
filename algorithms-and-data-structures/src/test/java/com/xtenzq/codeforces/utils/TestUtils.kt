package com.xtenzq.codeforces.utils

import org.junit.jupiter.api.Assertions.assertEquals
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun assert(input: String, expectedOutput: String, problem: () -> Unit) {
    val inputStream = ByteArrayInputStream(input.toByteArray())
    val outputStream = ByteArrayOutputStream()
    System.setIn(inputStream)
    System.setOut(PrintStream(outputStream))

    problem()

    assertEquals(expectedOutput, outputStream.toString())
}