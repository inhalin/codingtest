package bj.io;

import java.io.*;

//https://www.acmicpc.net/problem/11720
//숫자의 합
public class Q11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;
        for (byte b : br.readLine().getBytes()) {
            sum += b - '0';
        }
        System.out.println(sum);
    }
}