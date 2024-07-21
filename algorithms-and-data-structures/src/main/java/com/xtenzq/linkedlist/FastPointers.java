package com.xtenzq.linkedlist;

import com.xtenzq.linkedlist.utils.ListNode;

public class FastPointers {

    /**
     * Returns the value of the node of the middle (number of nodes is odd)
     *
     * @param head head of a linked list
     * @return value of the middle node
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity
     */
    public static int getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }

    /**
     * Checks if given linked list with {@code head} has cycle
     *
     * @param head head of a linked list
     * @return {@code true} if linked list has cycle, {@code false} otherwise
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity
     */
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
