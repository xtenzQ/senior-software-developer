package com.xtenzq.arrays;

public class TwoPointers {

    /**
     * Checks if the given string is a palindrome.
     *
     * @param input the string to check for palindrome properties
     * @return {@code true} if the input string is a palindrome, false otherwise
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity, where n is the length of the input string.
     */
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

    /**
     * Checks if there are two distinct elements in the sorted array that sum up to the given target.
     *
     * @param sortedArray an array of integers that is already sorted in ascending order
     * @param target      the sum to find in the array
     * @return {@code true} if there are two distinct elements in the array whose sum is equal to the target, {@code false} otherwise
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity, where n is the length of the sortedArray.
     */
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

    /**
     * Merges two sorted arrays into one sorted array.
     *
     * @param arr1 the first sorted array
     * @param arr2 the second sorted array
     * @return a new sorted array containing all elements from both input arrays
     * @implNote This method runs in {@code O(n + m)} time complexity and {@code O(1)} space complexity,
     * where {@code n} is the length of {@code arr1} and {@code m} is the length of {@code arr2}.
     */
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }

        return res;
    }

    /**
     * Determines if string s is a subsequence of string t.
     * A subsequence of a string is a sequence of characters that can be obtained
     * by deleting some (or none) of the characters from the original string,
     * while maintaining the relative order of the remaining characters.
     *
     * @param s the subsequence to check
     * @param t the string to check against
     * @return {@code true} if {@code s} is a subsequence of {@code t}, {@code false} otherwise
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity,
     * where {@code n} is the length of {@code t}.
     * @see <a href="https://leetcode.com/problems/is-subsequence/">392. Is Subsequence</a>
     */
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

    /**
     * Reverses the input array of characters in-place.
     *
     * @param s the array of characters to be reversed
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity,
     * where {@code n} is the length of {@code s}.
     * @see <a href="https://leetcode.com/problems/reverse-string/">344. Reverse String</a>
     */
    public static void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            var temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    /**
     * Given an integer array sorted in non-decreasing order, returns an array of the squares of each number sorted in non-decreasing order.
     *
     * @param nums the sorted integer array
     * @return a new array containing the squares of each number from the input array, sorted in non-decreasing order
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(n)} space complexity,
     * where {@code n} is the length of {@code nums}.
     * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">977. Squares of a Sorted Array</a>
     */
    public static int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1, k = nums.length - 1;
        int[] ans = new int[nums.length];
        while (i <= j) {
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                ans[k--] = nums[j] * nums[j];
                j--;
            } else {
                ans[k--] = nums[i] * nums[i];
                i++;
            }
        }
        return ans;
    }
}

