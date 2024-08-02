package com.xtenzq.leetcode;

import java.util.Stack;

public class MakeGood {

    public static String makeGood(String s) {
        if (s.length() == 1) {
            return s;
        }
        Stack<Character> chars = new Stack<>();
        chars.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!chars.empty() && Math.abs((int)s.charAt(i) - (int)chars.peek()) == 32) {
                chars.pop();
            } else {
                chars.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }

}
