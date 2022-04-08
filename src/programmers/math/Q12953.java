package programmers.math;

public class Q12953 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {2, 6, 8, 14};
        System.out.println(s.solution(arr1));
    }

    static class Solution {
        public int solution(int[] arr) {
            int gcd = gcd(arr[0], arr[1]);
            int lcm = (arr[0] * arr[1]) / gcd;

            for (int i = 1; i < arr.length - 1; i++) {
                gcd = gcd(lcm, arr[i + 1]);
                lcm = (lcm * arr[i + 1]) / gcd;
            }

            return lcm;
        }

        static int gcd(int a, int b) {
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }

            return a;
        }
    }
}
