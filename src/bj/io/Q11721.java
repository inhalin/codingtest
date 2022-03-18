package bj.io;

import java.io.*;

//https://www.acmicpc.net/problem/11721
//열 개씩 끊어 출력하기
public class Q11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 1; i <= str.length(); i++) {
            System.out.print(str.charAt(i-1));
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}