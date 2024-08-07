package com.xtenzq.tree;

import org.junit.jupiter.api.Test;

import static com.xtenzq.tree.BinaryTree.maxDepth;
import static com.xtenzq.tree.utils.TreeNode.buildTree;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeTest {

    @Test
    void maxDepth_case1() {
        assertEquals(3, maxDepth(buildTree(3, 9, 20, null, null, 15, 7)));
    }

    @Test
    void maxDepth_case2() {
        assertEquals(2, maxDepth(buildTree(1, null, 2)));
    }
}