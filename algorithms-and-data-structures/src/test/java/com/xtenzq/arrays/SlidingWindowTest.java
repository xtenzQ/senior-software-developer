package com.xtenzq.arrays;

import org.junit.jupiter.api.Test;

import static com.xtenzq.arrays.SlidingWindow.findLongestSubArraySumLessOrEqualK;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowTest {

    @Test
    void testFindLongestSubArraySumLessOrEqualK_Example() {
        int[] nums = {3, 2, 1, 3, 1, 1};
        int k = 5;
        assertEquals(3, findLongestSubArraySumLessOrEqualK(nums, k));
    }

    @Test
    void testFindLongestSubArraySumLessOrEqualK_AllElementsLessThanK() {
        int[] nums = {1, 2, 1, 2, 1};
        int k = 5;
        assertEquals(3, findLongestSubArraySumLessOrEqualK(nums, k));
    }

    @Test
    void testFindLongestSubArraySumLessOrEqualK_SingleElementEqualsK() {
        int[] nums = {5};
        int k = 5;
        assertEquals(1, findLongestSubArraySumLessOrEqualK(nums, k));
    }

    @Test
    void testFindLongestSubArraySumLessOrEqualK_SingleElementGreaterThanK() {
        int[] nums = {6};
        int k = 5;
        assertEquals(0, findLongestSubArraySumLessOrEqualK(nums, k));
    }

    @Test
    void testFindLongestSubArraySumLessOrEqualK_MultipleSubarrays() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        assertEquals(2, findLongestSubArraySumLessOrEqualK(nums, k));
    }

    @Test
    void testFindLongestSubArraySumLessOrEqualK_EmptyArray() {
        int[] nums = {};
        int k = 5;
        assertEquals(0, findLongestSubArraySumLessOrEqualK(nums, k));
    }
}