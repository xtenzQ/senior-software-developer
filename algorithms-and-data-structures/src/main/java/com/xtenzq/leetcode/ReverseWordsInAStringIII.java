package com.xtenzq.leetcode;

/**
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">557. Reverse Words in a String III</a>
 */
public class ReverseWordsInAStringIII {

    public static String reverseWords(String s) {
        char[] answer = s.toCharArray();
        int left = 0;
        for (int i = 0; i < s.length() + 1; i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                int right = i - 1;
                while (left <= right) {
                    var temp = s.charAt(left);
                    answer[left] = s.charAt(right);
                    answer[right] = temp;
                    left++;
                    right--;
                }
                left = i + 1;
            }
        }
        return new String(answer);
    }
}
