package com.xtenzq.hashing;

import org.junit.jupiter.api.Test;

import static com.xtenzq.hashing.ExistenceCheck.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ExistenceCheckTest {

    @Test
    void twoSum_case1() {
        assertArrayEquals(new int[]{1, 0}, twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void twoSum_case2() {
        assertArrayEquals(new int[]{2, 1}, twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void twoSum_case3() {
        assertArrayEquals(new int[]{1, 0}, twoSum(new int[]{3, 3}, 6));
    }
}