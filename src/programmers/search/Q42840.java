package programmers.search;

import java.util.Arrays;

public class Q42840 {
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};

        int[] solution = solution(answers);
        System.out.println(Arrays.toString(solution));
    }

    static int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]) score[0]++;
            if (answers[i] == p2[i % p2.length]) score[1]++;
            if (answers[i] == p3[i % p3.length]) score[2]++;
        }

        int max = Math.max(Math.max(score[0], score[1]), score[2]);

        int maxCount = 0;
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) maxCount++;
        }

        int[] answer = new int[maxCount];
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) answer[i] = i + 1;
        }

        return answer;
    }
}
