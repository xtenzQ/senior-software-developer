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
}
