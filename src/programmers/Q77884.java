package programmers;

public class Q77884 {
    public static void main(String[] args) {
        int[][] a = {{13, 17}, {24, 27}};

        for (int i = 0; i < a.length; i++) {
            System.out.println(solution(a[i][0], a[i][1]));
        }
    }

    static int solution(int left, int right) {

        int sum = 0;
        for (int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);
            int count = count(i, sqrt);
            if (count % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        return sum;
    }

    static int count(int n, int sqrt) {
        int count = 0;
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i){
                    count++;
                }
            }
        }
        return count;
    }
}
