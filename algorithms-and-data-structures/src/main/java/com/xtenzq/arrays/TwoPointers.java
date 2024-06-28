package com.xtenzq.arrays;

public class TwoPointers {

    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean canBeSummed(int[] sortedArray, int target) {
        int start = 0;
        int end = sortedArray.length - 1;
        while (start < end) {
            int sum = sortedArray[start] + sortedArray[end];
            if (sum == target) {
                return true;
            }
            if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }
}
