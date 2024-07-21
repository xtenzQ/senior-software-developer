package com.xtenzq.linkedlist;

import org.junit.jupiter.api.Test;

import static com.xtenzq.linkedlist.FastPointers.getMiddle;
import static com.xtenzq.linkedlist.FastPointers.hasCycle;
import static com.xtenzq.linkedlist.utils.ListNode.buildLinkedList;
import static com.xtenzq.linkedlist.utils.ListNode.buildLinkedListWithCycle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FastPointersTest {

    @Test
    void getMiddle_case1() {
        int actual = getMiddle(buildLinkedList(1, 2, 3, 4, 5));
        assertEquals(3, actual);
    }

    @Test
    void getMiddle_case2() {
        int actual = getMiddle(buildLinkedList(1));
        assertEquals(1, actual);
    }

    @Test
    void hasCycle_case1() {
        assertTrue(hasCycle(buildLinkedListWithCycle(new int[]{3, 2, 0, -4}, 1)));
    }

    @Test
    void hasCycle_case2() {
        assertTrue(hasCycle(buildLinkedListWithCycle(new int[]{1, 2}, 0)));
    }

    @Test
    void hasCycle_case3() {
        assertFalse(hasCycle(buildLinkedListWithCycle(new int[]{1}, -1)));
    }
}