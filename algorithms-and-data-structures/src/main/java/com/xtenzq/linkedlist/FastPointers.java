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

    /**
     * Return the {@code k}-th node from the end of the linked list
     *
     * @param head of linked list
     * @param k element position from the end
     * @return node value of {@code k}-th node from the end
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity
     */
    public static int nodeFromEnd(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }

    /**
     * Returns the middle node of the linked list
     *
     * @param head head of linked list
     * @return middle node of the linked list
     * @implNote This method runs in {@code O(n)} time complexity and {@code O(1)} space complexity
     * @see <a href="https://leetcode.com/problems/middle-of-the-linked-list/">876. Middle of the Linked List</a>
     */
    public static ListNode middleNode(ListNode head) {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
