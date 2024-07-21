package com.xtenzq.linkedlist.utils;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode buildLinkedList(int...nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }

    public static ListNode buildLinkedListWithCycle(int[] nums, int cyclePos) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        if (cyclePos > nums.length - 1 || cyclePos < -1) {
            throw new IllegalArgumentException("cycle position is out of bound");
        }

        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        ListNode cycleNode = (cyclePos == 0) ? head : null;

        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
            if (i == cyclePos) {
                cycleNode = current;
            }
        }

        if (cyclePos != -1) {
            current.next = cycleNode;
        }

        return head;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNode other = (ListNode) obj;
        return val == other.val && (Objects.equals(next, other.next));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}
