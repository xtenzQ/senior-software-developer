package com.xtenzq.leetcode;

import org.junit.jupiter.api.Test;

import static com.xtenzq.leetcode.ReverseWordsInAStringIII.reverseWords;
import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringIIITest {

    @Test
    void case1() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords("Let's take LeetCode contest"));
    }

    @Test
    void case2() {
        assertEquals("rM gniD", reverseWords("Mr Ding"));
    }
}