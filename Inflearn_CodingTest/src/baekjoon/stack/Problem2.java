package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem2 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0){
                stack.pop();
            }else{
                stack.push(num);
            }

        }
        int result = 0;
        for(int num : stack){
            result += num;
        }
        System.out.println(result);
    }
}
