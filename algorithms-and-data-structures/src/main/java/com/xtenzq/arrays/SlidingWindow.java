package com.xtenzq.arrays;

public class SlidingWindow {

    /**
     * Finds the length of the longest subarray with a sum less than or equal to a given value.
     *
     * @param nums the array of positive integers
     * @param k the maximum allowed sum of the subarray
     * @return the length of the longest subarray with a sum less than or equal to {@code k}
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity,
     * where {@code n} is the length of {@code nums}.
     */
    public static int findLongestSubArraySumLessOrEqualK(int[] nums, int k) {
        int left = 0, answer = 0, curr = 0;
        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr > k) {
                curr -= nums[left];
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }
}
