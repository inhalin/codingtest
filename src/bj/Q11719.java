package bj;

import java.io.*;

//https://www.acmicpc.net/problem/11719
//그대로 출력하기 2
public class Q11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int cnt = 0;
        while ((str = br.readLine()) != null) {
            if (str.length() > 100 || !isAlphaNumericSpace(str) || ++cnt > 100) break;
            bw.write(str+"\n");
        }
        bw.flush();
        bw.close();
    }

    static boolean isAlphaNumericSpace(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && !Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}