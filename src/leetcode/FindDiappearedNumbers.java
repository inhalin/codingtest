package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDiappearedNumbers {
    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        int[] a2 = {1,1};
        System.out.println(findDisappearedNumbers(a));
        System.out.println(findDisappearedNumbers(a2));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (Arrays.binarySearch(nums, i) < 0) {
                res.add(i);
            }
        }

        return res;
    }
}
