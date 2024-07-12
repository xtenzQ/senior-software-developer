package com.xtenzq.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counting {

    /**
     * Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers,
     * returns the list of integers that are present in each array of nums sorted in ascending order.
     *
     * @param nums the 2D integer array
     * @return the list of integers present in each array of nums
     * @implNote This method runs in {@code O(n * m + k log k)} time complexity,
     * where {@code n} is the number of arrays, {@code m} is the average length of the arrays, and {@code k} is the number of common elements.
     * @see <a href="https://leetcode.com/problems/intersection-of-multiple-arrays/">2248. Intersection of Multiple Arrays</a>
     */
    public static List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int[] arr : nums) {
            for (int num : arr) {
                numCount.put(num, numCount.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer> answer = new ArrayList<>();
        for (int num : numCount.keySet()) {
            if (numCount.get(num) == nums.length) {
                answer.add(num);
            }
        }

        Collections.sort(answer);
        return answer;
    }
}
