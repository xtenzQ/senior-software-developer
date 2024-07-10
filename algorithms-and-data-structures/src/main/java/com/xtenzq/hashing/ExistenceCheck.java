package com.xtenzq.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    /**
     * Given a string s consisting of lowercase English letters, returns the first letter to appear twice.
     *
     * @param s the input string
     * @return the first letter to appear twice
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity,
     * where {@code n} is the length of {@code s}.
     * @see <a href="https://leetcode.com/problems/first-letter-to-appear-twice/">2351. First Letter to Appear Twice</a>
     */
    public static char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return 'a';
    }
}
