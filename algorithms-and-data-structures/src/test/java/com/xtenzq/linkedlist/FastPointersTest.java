package com.xtenzq.linkedlist;

import org.junit.jupiter.api.Test;

import static com.xtenzq.linkedlist.FastPointers.getMiddle;
import static com.xtenzq.linkedlist.utils.ListNode.buildLinkedList;
import static org.junit.jupiter.api.Assertions.*;

class FastPointersTest {

    @Test
    void middleNode_case1() {
        int actual = getMiddle(buildLinkedList(1, 2, 3, 4, 5));
        assertEquals(3, actual);
    }

    @Test
    void middleNode_case2() {
        int actual = getMiddle(buildLinkedList(1));
        assertEquals(1, actual);
    }
}