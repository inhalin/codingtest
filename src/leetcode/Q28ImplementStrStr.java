package leetcode;

import java.util.Arrays;

public class Q28ImplementStrStr {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[][] sa = {
                {"hello", "ll"},
                {"aaaaa", "bba"},
                {"", ""},
                {"mississipi", "issip"},
                {"a", ""},
                {"a", "a"}
        };

        for (String[] str : sa) {
            System.out.println("Input: heystack = \"" + str[0] + "\", needle = \"" + str[1] + "\"");
            System.out.println("Output: " + s.strStr(str[0], str[1]));
        }
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            if (! haystack.contains(needle)) return -1;
            if (needle.length() == 0) return 0;

            String[] temp = haystack.split(needle);

            return (temp.length == 0) ? 0 : temp[0].length();
        }
    }
}
