package bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack {
    int[] stack;
    int size;

    public Stack(int size) {
        stack = new int[size];
        this.size = 0;
    }

    public void push(int a) {
        stack[size++] = a;
    }

    public int pop() {
        if (size > 0) {
            int res = stack[size - 1];
            size--;

            return res;
        }

        return -1;
    }

    public int size() {
        return size;
    }

    public int empty() {
        return (size == 0) ? 1 : 0;
    }

    public int top() {
        return (size > 0) ? stack[size - 1] : -1;
    }
}

public class Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack stack = new Stack(N);

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            switch (s) {
                case "pop": sb.append(stack.pop()).append("\n");
                case "size": sb.append(stack.size()).append("\n");
                case "empty": sb.append(stack.empty()).append("\n");
                case "top": sb.append(stack.top()).append("\n");
                default: stack.push(Integer.parseInt(s.split(" ")[1]));
            }
        }
        System.out.println(sb);
    }
}
