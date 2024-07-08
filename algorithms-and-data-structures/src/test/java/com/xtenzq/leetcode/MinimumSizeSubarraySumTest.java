package com.xtenzq.leetcode;

import org.junit.jupiter.api.Test;

import static com.xtenzq.leetcode.MinimumSizeSubarraySum.minSubArrayLen;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSizeSubarraySumTest {

    @Test
    void case1() {
        assertEquals(2, minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    @Test
    void case2() {
        assertEquals(1, minSubArrayLen(4, new int[]{1, 4, 4}));
    }

    @Test
    void case3() {
        assertEquals(0, minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }
}