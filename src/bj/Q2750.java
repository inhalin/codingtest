package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(br.readLine()));

        for (int i = 1; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            int j = list.size();
            while (j > 0) {
                if (list.get(j - 1) < num) {
                    break;
                } else {
                    j--;
                }
            }
            list.add(j, num);
        }

        for (Integer n : list) {
            System.out.println(n);
        }
    }
}
