package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Problem1 {
    public String solution() {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        Stack<Character> stack = new Stack<>();
        String answer = "YES";

        for(char ch : str.toCharArray()){
            if(ch == '(')
                stack.push(ch);
            else if(ch == ')'){
                if(stack.empty()){
                    answer = "NO";
                }else{
                    stack.pop();
                }
            }
        }
        if(!stack.empty())
            answer = "NO";

        return answer;

    }
}
