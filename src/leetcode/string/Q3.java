package leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        String[] sa = {"abcabcbb", "bbbbb", "pwwkew", ""};
        for (String s : sa) {
            System.out.println(lengthOfLongestSubstring(s));
        }
    }

    static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int res = 0;
        for (int j = 0; j < s.length(); j++) {
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i++));
            }
            set.add(s.charAt(j));
            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}
