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
}
