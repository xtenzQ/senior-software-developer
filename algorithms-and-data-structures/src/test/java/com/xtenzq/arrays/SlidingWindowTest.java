package com.xtenzq.arrays;

import org.junit.jupiter.api.Test;

import static com.xtenzq.arrays.SlidingWindow.findLongestSubstringAfterOneFlip;
import static com.xtenzq.arrays.SlidingWindow.findLongestSubArraySumLessOrEqualK;
import static com.xtenzq.arrays.SlidingWindow.numSubarrayProductLessThanK;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void testFindLongestSubstringAfterOneFlip_Example1() {
        String s = "1101100111";
        assertEquals(5, findLongestSubstringAfterOneFlip(s));
    }

    @Test
    void testFindLongestSubstringAfterOneFlip_AllOnes() {
        String s = "1111111";
        assertEquals(7, findLongestSubstringAfterOneFlip(s));
    }

    @Test
    void testFindLongestSubstringAfterOneFlip_AllZeros() {
        String s = "00000";
        assertEquals(1, findLongestSubstringAfterOneFlip(s));
    }

    @Test
    void testFindLongestSubstringAfterOneFlip_SingleZero() {
        String s = "1";
        assertEquals(1, findLongestSubstringAfterOneFlip(s));
    }

    @Test
    void testFindLongestOneBinaryString_SingleSubstringAfterOne() {
        String s = "0";
        assertEquals(1, findLongestSubstringAfterOneFlip(s));
    }

    @Test
    void testFindLongestSubstringAfterOneFlip_AlternateOnesAndZeros() {
        String s = "1010101010";
        assertEquals(3, findLongestSubstringAfterOneFlip(s));
    }

    @Test
    void testFindLongestSubstringAfterOneFlip_LeadingZeros() {
        String s = "000011110000";
        assertEquals(5, findLongestSubstringAfterOneFlip(s));
    }

    @Test
    void testFindLongestSubstringAfterOneFlip_TrailingZeros() {
        String s = "11110000";
        assertEquals(5, findLongestSubstringAfterOneFlip(s));
    }

    @Test
    void testFindLongestSubstringAfterOneFlip_ComplexPattern() {
        String s = "100110111001111";
        assertEquals(6, findLongestSubstringAfterOneFlip(s));
    }

    @Test
    void testNumSubarrayProductLessThanK_SubarraysWithProductLessThan100() {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        assertEquals(8, numSubarrayProductLessThanK(nums, k));
    }

    @Test
    void testNumSubarrayProductLessThanK_SubarraysWithProductLessThan0() {
        int[] nums = {1, 2, 3};
        int k = 0;
        assertEquals(0, numSubarrayProductLessThanK(nums, k));
    }

    @Test
    void testNumSubarrayProductLessThanK_SubarraysWithProductLessThan1() {
        int[] nums = {1, 2, 3};
        int k = 1;
        assertEquals(0, numSubarrayProductLessThanK(nums, k));
    }

    @Test
    void testNumSubarrayProductLessThanK_SubarraysWithProductLessThan10() {
        int[] nums = {1, 2, 3};
        int k = 10;
        assertEquals(6, numSubarrayProductLessThanK(nums, k));
    }

    @Test
    void testNumSubarrayProductLessThanK_EmptyArray() {
        int[] nums = {};
        int k = 100;
        assertEquals(0, numSubarrayProductLessThanK(nums, k));
    }
}