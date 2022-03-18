package bj.io;

import java.io.*;

//https://www.acmicpc.net/problem/11718
//그대로 출력하기
public class Q11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while ((str = br.readLine()) != null) {
            if (str.length() > 100 || str.startsWith(" ") || str.endsWith(" ") || str.isEmpty()) break;
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }
}