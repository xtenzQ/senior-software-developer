package com.xtenzq.hashing;

import java.util.HashMap;
import java.util.Map;

public class ExistenceCheck {

    /**
     * Given an array of integers nums and an integer target, returns indices of two numbers such that they add up to target.
     *
     * @param nums   the array of integers
     * @param target the target sum
     * @return an array containing the indices of the two numbers that add up to target
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(n)} space complexity,
     * where {@code n} is the length of {@code nums}.
     * @see <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[]{i, map.get(key)};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
