package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 균형잡힌 세상
public class Problem4 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();

            if(str.equals("."))
                break;

            boolean flag = true;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);

                if(ch == '(' || ch == '[')
                    stack.push(ch);
                else if(ch == ')'){
                    if (stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    if (stack.peek() == '('){
                        stack.pop();
                    }else{
                        flag = false;
                        break;
                    }
                }else if(ch == ']'){
                    if (stack.isEmpty()){
                        flag = false;
                        break;
                    }
                    if(stack.peek() == '['){
                        stack.pop();
                    }else {
                        flag = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty() || !flag){
                sb.append("no").append('\n');
            }else{
                sb.append("yes").append('\n');
            }
            stack.clear();
        }

        System.out.println(sb);


    }

}
