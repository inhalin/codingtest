package leetcode.arrays;


import java.util.*;

public class ThirdMax {
    public static void main(String[] args) {
        int[][] a = {{
                3, 2, 1
        }, {
                2, 2, 3, 1
        }, {
                1, 2
        }, {
                1, 2, 2, 5, 3, 5
        }, {
                1, 2, -2147483648
        }, {
                1, -2147483648, 2
        }
        };

        for (int[] nums : a) {
            System.out.println(thirdMax(nums));
        }
    }

    public static int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        Set<Integer> hs = new HashSet<>();
        for (int n : nums) {
            hs.add(n);
        }
        if (hs.size() >= 3) {
            hs.remove(Collections.max(hs));
            hs.remove(Collections.max(hs));
        }
        return Collections.max(hs);
    }
}
