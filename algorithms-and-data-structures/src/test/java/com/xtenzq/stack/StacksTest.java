package com.xtenzq.stack;

import org.junit.jupiter.api.Test;

import static com.xtenzq.stack.Stacks.isValid;
import static com.xtenzq.stack.Stacks.removeDuplicates;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void removeDuplicates_test1() {
        assertEquals("ca", removeDuplicates("abbaca"));
    }

    @Test
    void removeDuplicates_test2() {
        assertEquals("ay", removeDuplicates("azxxzy"));
    }
}