package leetcode.search;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;

//https://leetcode.com/problems/first-bad-version/
//First Bad Version
public class Q278FirstBadVersion {
    public static void main(String[] args) {
        int res = new Solution().firstBadVersion(2126753390);
        System.out.println(res);
    }

    static class Solution {
        public int firstBadVersion(int n) {
            int bad = 0;
            int start = 1;
            int end = n;
            int mid = start - (start - end) / 2;
//        int mid = start + (end - start) / 2;

            while (start <= end) {
                if (isBadVersion(mid)) {
                    bad = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                mid = start - (start - end) / 2;
            }

            return bad;
        }

        static boolean isBadVersion(int version) {
            return version >= 1702766719;
        }
    }
}


