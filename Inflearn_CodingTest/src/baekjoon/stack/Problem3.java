package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem3 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<n; i++){
            String str = br.readLine();

            int j=0;
            boolean flag = false;
            while(j < str.length()){
                char ch = str.charAt(j);
                if (ch == '(')
                    stack.push('(');
                else{
                    if(stack.isEmpty()){
                        flag = true;
                        break;
                    }
                    else
                        stack.pop();
                }
                j++;
            }
            if(stack.isEmpty() && !flag){
                sb.append("YES").append('\n');
            }else{
                sb.append("NO").append('\n');
            }
            stack.clear();
        }

        System.out.println(sb);
    }
}
