package com.xtenzq.stack;

import java.util.Map;
import java.util.Stack;

public class Stacks {

    /**
     * Determines if the input string is valid.
     * <p>
     * An input string is valid if:
     * <ol>
     *     <li>Open brackets must be closed by the same type of brackets;</li>
     *     <li>Open brackets must be closed in the correct order;</li>
     *     <li>Every close bracket has a corresponding open bracket of the same type.</li>
     * </ol>
     *
     * @param s string to validate
     * @return {@code true} if string is valid, {@code false} otherwise
     * @implNote This method runs in {@code O(n)} time complexity, where {@code n} is the length of {@code s}.
     * @see <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
     */
    public static boolean isValid(String s) {
        Map<Character, Character> brackets = Map.of('(', ')', '{', '}', '[', ']');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (brackets.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.empty() || brackets.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    /**
     * Remove all adjacent duplicates in string
     *
     * @param s string to remove duplicates from
     * @return string without duplicates
     * @implNote This method runs in {@code O(n)} time and space complexity, where {@code n} is the length of {@code s}.
     * @see <a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/">1047. Remove All Adjacent Duplicates In String</a>
     */
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!sb.isEmpty() && sb.charAt(sb.length() - 1) == s.charAt(i)) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
