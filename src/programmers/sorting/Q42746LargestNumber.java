package programmers.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Q42746LargestNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] numbers = {
                {6, 10, 2},
                {3, 30, 34, 5, 9},
                {0, 0, 0}
        };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(s.solution(numbers[i]));
        }
    }

    static class Solution {
        public String solution(int[] numbers) {
            String answer = "";
            String[] str = new String[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                str[i] = String.valueOf(numbers[i]);
            }

            Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

            if (str[0].equals("0")) return "0";

            for (String s : str) {
                answer += s;
            }

            return answer;
        }
    }
}
