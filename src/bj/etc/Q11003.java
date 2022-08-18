package bj.etc;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Deque<Node> deq = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int D = Integer.parseInt(st.nextToken());

            while (!deq.isEmpty() && deq.getLast().value > D) {
                deq.removeLast();
            }

            deq.addLast(new Node(D, i));

            if (deq.getFirst().index < i - L + 1) {
                deq.removeFirst();
            }
            bw.write(deq.getFirst().value + " ");
        }

        bw.flush();
        bw.close();
    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
