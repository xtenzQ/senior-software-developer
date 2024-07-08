package com.xtenzq.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/minimum-size-subarray-sum/">209. Minimum Size Subarray Sum</a>
 */
public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, answer = Integer.MAX_VALUE, curr = 0;
        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr >= target) {
                answer = Math.min(answer, right - left + 1);
                curr -= nums[left];
                left++;
            }
        }
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}
