package com.xtenzq.leetcode;

import java.util.Stack;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        Stack<String> fullPath = new Stack<>();
        String[] folders = path.split("/");
        for (String folder : folders) {
            if (folder.isEmpty() || folder.equals(".")) {
                continue;
            }
            if (folder.equals("..")) {
                if (!fullPath.empty()) {
                    fullPath.pop();
                }
            } else {
                fullPath.push(folder);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String dir : fullPath) {
            sb.append("/");
            sb.append(dir);
        }
        return !sb.toString().isEmpty() ? sb.toString() : "/";
    }
}
