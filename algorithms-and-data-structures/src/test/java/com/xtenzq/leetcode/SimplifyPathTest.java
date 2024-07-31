package com.xtenzq.leetcode;

import org.junit.jupiter.api.Test;

import static com.xtenzq.leetcode.SimplifyPath.simplifyPath;
import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {

    @Test
    void simplifyPath_case1() {
        assertEquals("/home", simplifyPath("/home/"));
    }

    @Test
    void simplifyPath_case2() {
        assertEquals("/home/foo", simplifyPath("/home//foo/"));
    }

    @Test
    void simplifyPath_case3() {
        assertEquals("/home/user/Pictures", simplifyPath("/home/user/Documents/../Pictures"));
    }

    @Test
    void simplifyPath_case4() {
        assertEquals("/", simplifyPath("/../"));
    }

    @Test
    void simplifyPath_case5() {
        assertEquals("/.../b/d", simplifyPath("/.../a/../b/c/../d/./"));
    }
}