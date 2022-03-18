package bj.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10951
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class Q10951 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        while((str = br.readLine())!=null){
            st = new StringTokenizer(str," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A+B).append('\n');
        }
        System.out.println(sb);
    }
}