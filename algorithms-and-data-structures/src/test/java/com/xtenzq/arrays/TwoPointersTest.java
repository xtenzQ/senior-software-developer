package com.xtenzq.arrays;

import org.junit.jupiter.api.Test;

import static com.xtenzq.arrays.TwoPointers.isSubsequence;
import static com.xtenzq.arrays.TwoPointers.canBeSummed;
import static com.xtenzq.arrays.TwoPointers.isPalindrome;
import static com.xtenzq.arrays.TwoPointers.mergeSortedArrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoPointersTest {

    @Test
    void testEmptyStringPalindrome() {
        assertTrue(isPalindrome(""));
    }

    @Test
    void testSingleCharacterPalindrome() {
        assertTrue(isPalindrome("a"));
    }

    @Test
    void testSimplePalindrome() {
        assertTrue(isPalindrome("madam"));
    }

    @Test
    void testSimpleNonPalindrome() {
        assertFalse(isPalindrome("hello"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertTrue(isPalindrome("a man a plan a canal panama".replace(" ", "")));
    }

    @Test
    void testNonPalindromeWithSpaces() {
        assertFalse(isPalindrome("hello world"));
    }

    @Test
    void testPalindromeWithMixedCase() {
        assertTrue(isPalindrome("Able was I ere I saw Elba".replace(" ", "").toLowerCase()));
    }

    @Test
    void testPalindromeWithPunctuation() {
        assertTrue(isPalindrome("A man, a plan, a canal, Panama".replaceAll("[\\W]", "").toLowerCase()));
    }

    @Test
    void testNonPalindromeWithPunctuation() {
        assertFalse(isPalindrome("Hello, world!"));
    }

    @Test
    void testEmptyArrayTwoSum() {
        int[] array = {};
        int target = 5;
        assertFalse(canBeSummed(array, target));
    }

    @Test
    void testSingleElementArrayTwoSum() {
        int[] array = {5};
        int target = 5;
        assertFalse(canBeSummed(array, target));
    }

    @Test
    void testTwoElementsSumToTarget() {
        int[] array = {1, 4};
        int target = 5;
        assertTrue(canBeSummed(array, target));
    }

    @Test
    void testTwoElementsDoNotSumToTarget() {
        int[] array = {1, 2};
        int target = 5;
        assertFalse(canBeSummed(array, target));
    }

    @Test
    void testMultipleElementsSumToTarget() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 9;
        assertTrue(canBeSummed(array, target));
    }

    @Test
    void testMultipleElementsDoNotSumToTarget() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 10;
        assertFalse(canBeSummed(array, target));
    }

    @Test
    void testSumWithNegativeNumbers() {
        int[] array = {-3, -1, 1, 2, 4};
        int target = 1;
        assertTrue(canBeSummed(array, target));
    }

    @Test
    void testNegativeTarget() {
        int[] array = {-5, -3, -1, 2, 4};
        int target = -4;
        assertTrue(canBeSummed(array, target));
    }

    @Test
    void testNoPossibleSum() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 20;
        assertFalse(canBeSummed(array, target));
    }

    @Test
    void testZeroTarget() {
        int[] array = {-2, -1, 0, 1, 2};
        int target = 0;
        assertTrue(canBeSummed(array, target));
    }

    @Test
    void testMergeBothEmptyArrays() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = {};
        assertArrayEquals(expected, mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testMergeFirstArrayEmpty() {
        int[] arr1 = {};
        int[] arr2 = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testMergeSecondArrayEmpty() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testMergeBothNonEmpty() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testMergeArraysWithDuplicates() {
        int[] arr1 = {1, 3, 5, 5};
        int[] arr2 = {2, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 5, 5, 6};
        assertArrayEquals(expected, mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testMergeArraysWithNegativeNumbers() {
        int[] arr1 = {-3, -1, 2};
        int[] arr2 = {-2, 0, 3};
        int[] expected = {-3, -2, -1, 0, 2, 3};
        assertArrayEquals(expected, mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testMergeArraysWithDifferentLengths() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected, mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testMergeArraysWithSameElements() {
        int[] arr1 = {1, 1, 1};
        int[] arr2 = {1, 1, 1};
        int[] expected = {1, 1, 1, 1, 1, 1};
        assertArrayEquals(expected, mergeSortedArrays(arr1, arr2));
    }

    @Test
    void testEmptySubsequence() {
        String s = "";
        String t = "abc";
        assertTrue(isSubsequence(s, t));
    }

    @Test
    void testEmptyStringSubsequence() {
        String s = "abc";
        String t = "";
        assertFalse(isSubsequence(s, t));
    }

    @Test
    void testSubsequenceAtStart() {
        String s = "abc";
        String t = "abcdef";
        assertTrue(isSubsequence(s, t));
    }

    @Test
    void testSubsequenceAtEnd() {
        String s = "def";
        String t = "abcdef";
        assertTrue(isSubsequence(s, t));
    }

    @Test
    void testSubsequenceInMiddle() {
        String s = "bdf";
        String t = "abcdef";
        assertTrue(isSubsequence(s, t));
    }

    @Test
    void testNonSubsequence() {
        String s = "aec";
        String t = "abcde";
        assertFalse(isSubsequence(s, t));
    }

    @Test
    void testIdenticalStrings() {
        String s = "abc";
        String t = "abc";
        assertTrue(isSubsequence(s, t));
    }

    @Test
    void testSingleCharacterMatch() {
        String s = "a";
        String t = "a";
        assertTrue(isSubsequence(s, t));
    }

    @Test
    void testSingleCharacterNonMatch() {
        String s = "a";
        String t = "b";
        assertFalse(isSubsequence(s, t));
    }

    @Test
    void testSubsequenceWithRepeatedCharacters() {
        String s = "aaa";
        String t = "aaabbb";
        assertTrue(isSubsequence(s, t));
    }

    @Test
    void testNonSubsequenceWithRepeatedCharacters() {
        String s = "aaa";
        String t = "ababab";
        assertTrue(isSubsequence(s, t));
    }

    @Test
    void testInterleavedSubsequence() {
        String s = "ace";
        String t = "abcde";
        assertTrue(isSubsequence(s, t));
    }

    @Test
    void testInterleavedNonSubsequence() {
        String s = "aec";
        String t = "abcde";
        assertFalse(isSubsequence(s, t));
    }
}