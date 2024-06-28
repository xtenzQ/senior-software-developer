package com.xtenzq.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoPointersTest {

    @Test
    void shouldReturnTrueIfPalindrome() {
        assertTrue(TwoPointers.isPalindrome("racecar"));
    }

    @Test
    void shouldReturnFalseIfNotPalindrome() {
        assertFalse(TwoPointers.isPalindrome("raceacar"));
    }

    @Test
    void shouldReturnTrueIfCanBeSummed() {
        assertTrue(TwoPointers.canBeSummed(new int[] { 1, 2, 4, 6, 8, 9, 14, 15 }, 13));
    }

    @Test
    void shouldReturnFalseIfCantBeSummed() {
        assertFalse(TwoPointers.canBeSummed(new int[] { 1, 2, 4, 6, 8, 9, 14, 15 }, 30));
    }
}