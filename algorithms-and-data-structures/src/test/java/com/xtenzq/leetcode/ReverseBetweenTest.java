package com.xtenzq.leetcode;

import org.junit.jupiter.api.Test;

import static com.xtenzq.leetcode.ReverseBetween.reverseBetween;
import static com.xtenzq.linkedlist.utils.ListNode.buildLinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseBetweenTest {

    @Test
    void reverseBetween_case1() {
        assertEquals(buildLinkedList(1, 4, 3, 2, 5), reverseBetween(buildLinkedList(1, 2, 3, 4, 5), 2, 4));
    }

    @Test
    void reverseBetween_case2() {
        assertEquals(buildLinkedList(5), reverseBetween(buildLinkedList(5), 1, 1));
    }

    @Test
    void reverseBetween_case3() {
        assertEquals(buildLinkedList(1, 2), reverseBetween(buildLinkedList(1, 2), 2, 2));
    }

    @Test
    void reverseBetween_case4() {
        assertEquals(buildLinkedList(2, 1), reverseBetween(buildLinkedList(1, 2), 1, 2));
    }
}