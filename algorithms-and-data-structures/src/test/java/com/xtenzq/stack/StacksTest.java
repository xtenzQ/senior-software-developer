package com.xtenzq.stack;

import org.junit.jupiter.api.Test;

import static com.xtenzq.stack.Stacks.isValid;
import static org.junit.jupiter.api.Assertions.*;

class StacksTest {

    @Test
    void isValid_case1() {
        assertTrue(isValid("()"));
    }

    @Test
    void isValid_case2() {
        assertTrue(isValid("()[]{}"));
    }

    @Test
    void isValid_case3() {
        assertFalse(isValid("(]"));
    }
}