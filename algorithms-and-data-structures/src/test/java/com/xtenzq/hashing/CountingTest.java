package com.xtenzq.hashing;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static com.xtenzq.hashing.Counting.intersection;
import static org.junit.jupiter.api.Assertions.*;

class CountingTest {

    @Test
    void intersection_case1() {
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        assertEquals(List.of(3, 4), intersection(nums));
    }

    @Test
    void intersection_case2() {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}};
        assertEquals(Collections.emptyList(), intersection(nums));
    }
}