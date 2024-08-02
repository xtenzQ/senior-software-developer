package com.xtenzq.leetcode;

import org.junit.jupiter.api.Test;

import static com.xtenzq.leetcode.MakeGood.makeGood;
import static org.junit.jupiter.api.Assertions.*;

class MakeGoodTest {

    @Test
    void makeGood_case1() {
        assertEquals("leetcode", makeGood("leEeetcode"));
    }

    @Test
    void makeGood_case2() {
        assertEquals("", makeGood("abBAcC"));
    }

    @Test
    void makeGood_case3() {
        assertEquals("s", makeGood("s"));
    }
}