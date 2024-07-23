package com.xtenzq.leetcode;

import com.xtenzq.linkedlist.utils.ListNode;

public class ReverseBetween {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null) {
            return head;
        }

        ListNode curr = head, beforeList = null;
        // traverse to the left - 1 node
        for (int i = 0; i < left - 2; i++) {
            curr = curr.next;
        }

        if (left > 1) {
            beforeList = curr; // the node that will point to the reversed list
            curr = curr.next; // traversal to the node to start reversing
        }

        int k = 0;
        ListNode prev = null, nextNode = null, tail = null;
        while (k < right - left + 1) {
            if (k == 0) {
                tail = curr; // save first node because it will become tail of the reversed list
            }
            // reverse node
            nextNode = curr.next; // save next node
            curr.next = prev; // reverse direction
            prev = curr; // prev node is now current
            curr = nextNode; // traversal
            k++;
        }

        // if there are no nodes before the one we have to reverse
        if (beforeList != null) {
            beforeList.next = prev;
        } else {
            // if we reverse from the start
            head = prev;
        }

        tail.next = nextNode;
        return head;
    }
}
