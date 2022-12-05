package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem1 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String cmd = st2.nextToken();
            if(cmd.equals("push")){
                int num = Integer.parseInt(st2.nextToken());
                stack.push(num);
            }else if(cmd.equals("top")){
                if (stack.size() <= 0) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(stack.peek()).append('\n');
                }
            }else if(cmd.equals("size")){
                sb.append(stack.size()).append('\n');
            }else if(cmd.equals("empty")){
                int flag = stack.empty() ? 1 : 0;
                sb.append(flag).append('\n');
            }else if(cmd.equals("pop")){
                if (stack.size() == 0)
                    sb.append(-1).append('\n');
                else{
                    sb.append(stack.pop()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
