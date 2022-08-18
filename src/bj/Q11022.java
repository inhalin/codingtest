package bj;

import java.io.*;

//https://www.acmicpc.net/problem/11022
//A+B - 8
public class Q11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String str = br.readLine();
            int A = str.charAt(0) - '0';
            int B = str.charAt(2) - '0';
            bw.write("Case #" + i + ": ");
            bw.write(A + " + " + B + " = " + (A + B) + "\n");
        }
        bw.flush();
        bw.close();
    }
}