package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10808 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        for (byte b : br.readLine().getBytes()) {
            alpha[b - 'a']++;
        }

        for (int a : alpha) {
            System.out.print(a + " ");
        }
    }
}
