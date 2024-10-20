package com.xtenzq.codeforces

import com.xtenzq.codeforces.utils.assert
import org.junit.jupiter.api.Test

class A2030KtTest {

    @Test
    fun `A2030 basic test`() {
        val input = "3\n" +
                "1\n" +
                "69\n" +
                "3\n" +
                "7 6 5\n" +
                "5\n" +
                "1 1 1 2 2\n"
        val expectedOutput = "0\n" +
                "4\n" +
                "4\n"

        assert(input, expectedOutput, { a2030() })
    }
}