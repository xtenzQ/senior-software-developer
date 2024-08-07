package com.xtenzq.tree;

import com.xtenzq.tree.utils.TreeNode;

public class BinaryTree {

    /**
     * Computes the maximum depth of a binary tree.
     *
     * @param root the root node of the binary tree
     * @return the maximum depth of the binary tree
     * @implNote The time complexity of this method is {@code O(n)}, where n is the number of nodes in the binary tree.
     * This is because the method visits each node exactly once.
     * <p>
     * The space complexity of this method is {@code O(h)}, where {@code h} is the height of the binary tree.
     * This is due to the recursion stack. In the worst case, the height of the tree can be {@code n} (in case of a completely skewed tree).
     * Therefore, the space complexity can be considered {@code O(h)} in the worst case and {@code O(log h)} in the best case (for a balanced tree).
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
