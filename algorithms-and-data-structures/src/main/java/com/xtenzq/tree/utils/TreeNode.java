package com.xtenzq.tree.utils;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public static TreeNode buildTree(Integer... array) {
        if (array == null || array.length == 0 || array[0] == null) {
            return null;
        }
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i < array.length) {
            TreeNode current = queue.poll();
            if (current == null) {
                continue;
            }
            if (i < array.length && array[i] != null) {
                current.left = new TreeNode(array[i]);
                queue.add(current.left);
            }
            i++;
            if (i < array.length && array[i] != null) {
                current.right = new TreeNode(array[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }
}
