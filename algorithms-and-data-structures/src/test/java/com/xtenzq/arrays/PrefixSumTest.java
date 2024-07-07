package com.xtenzq.arrays;

import org.junit.jupiter.api.Test;

import static com.xtenzq.arrays.PrefixSum.answerQueries;
import static com.xtenzq.arrays.PrefixSum.numberOfWaysToSplitArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrefixSumTest {

    @Test
    void testAnswerQueries_BasicCase() {
        int[] nums = {1, 6, 3, 2, 7, 2};
        int[][] queries = {{0, 3}, {2, 5}, {2, 4}};
        int limit = 13;
        boolean[] expected = {true, false, true};
        assertArrayEquals(expected, answerQueries(nums, queries, limit));
    }

    @Test
    void testAnswerQueries_SingleElement() {
        int[] nums = {5};
        int[][] queries = {{0, 0}};
        int limit = 10;
        boolean[] expected = {true};
        assertArrayEquals(expected, answerQueries(nums, queries, limit));
    }

    @Test
    void testAnswerQueries_SingleQuery() {
        int[] nums = {1, 2, 3, 4};
        int[][] queries = {{1, 3}};
        int limit = 10;
        boolean[] expected = {true};
        assertArrayEquals(expected, answerQueries(nums, queries, limit));
    }

    @Test
    void testAnswerQueries_LargeQuery() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i + 1;
        }
        int[][] queries = {{0, 999}, {0, 998}};
        int limit = 500000;
        boolean[] expected = {false, true};
        assertArrayEquals(expected, answerQueries(nums, queries, limit));
    }

    @Test
    void testNumberOfWaysToSplitArray_AllNegative() {
        int[] nums = {-1, -2, -3, -4, -5};
        int expected = 3;
        assertEquals(expected, numberOfWaysToSplitArray(nums));
    }

    @Test
    void testNumberOfWaysToSplitArray_SingleElement() {
        int[] nums = {5};
        int expected = 0;
        assertEquals(expected, numberOfWaysToSplitArray(nums));
    }

    @Test
    void testNumberOfWaysToSplitArray_TwoElements() {
        int[] nums = {5, -5};
        int expected = 1;
        assertEquals(expected, numberOfWaysToSplitArray(nums));
    }
}