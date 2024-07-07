package com.xtenzq.arrays;

public class PrefixSum {

    /**
     * Returns a boolean array indicating whether the sum of the subarray from x to y is less than limit for each query.
     *
     * @param nums the array of integers
     * @param queries the array of queries, where each query is represented as {@code [x, y]}
     * @param limit the integer limit
     * @return a boolean array representing the answer to each query
     * @implNote This method runs in {@code O(n)} time complexity, where {@code n} is the length of {@code nums}.
     */
    public static boolean[] answerQueries(int[] nums, int[][] queries, int limit) {
        int[] prefix = new int[nums.length];
        boolean[] answer = new boolean[queries.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        for (int i = 0; i < queries.length; i++) {
            int sum = prefix[queries[i][1]] - prefix[queries[i][0]] + nums[queries[i][0]];
            answer[i] = sum < limit;
        }
        return answer;
    }
}
