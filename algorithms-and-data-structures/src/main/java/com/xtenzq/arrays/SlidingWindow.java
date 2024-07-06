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

    /**
     * Finds the length of the longest substring of "1"s in a binary string after flipping at most one "0" to "1".
     *
     * @param s the binary string consisting of '0' and '1'
     * @return the length of the longest substring achievable that contains only '1's after flipping at most one '0'
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity,
     * where {@code n} is the length of {@code s}.
     */
    public static int findLongestSubstringAfterOneFlip(String s) {
        int left = 0, answer = 0, zeroCounter = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '0') {
                zeroCounter++;
            }

            while (zeroCounter > 1) {
                if (s.charAt(left) == '0') {
                    zeroCounter--;
                }
                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }

    /**
     * Returns the number of subarrays where the product of all the elements in the subarray
     * is strictly less than {@code k}.
     *
     * @param nums the array of positive integers
     * @param k the integer threshold
     * @return the number of subarrays with product less than {@code k}
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity,
     * where {@code n} is the length of {@code nums}.
     * @see <a href="https://leetcode.com/problems/subarray-product-less-than-k/">713. Subarray Product Less Than K</a>
     */
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int left = 0, count = 1, answer = 0;

        for (int right = 0; right < nums.length; right++) {
            count *= nums[right];
            while (count >= k) {
                count /= nums[left];
                left++;
            }

            answer += right - left + 1;
        }

        return answer;
    }
}
