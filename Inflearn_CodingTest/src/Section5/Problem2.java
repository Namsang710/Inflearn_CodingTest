package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Problem2 {
    public Stack<Character> solution() {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        Stack<Character> stack = new Stack();

        for(char ch : str.toCharArray()){
            if(ch == ')'){
                while(stack.pop() != '('){

                }
            }else{
                stack.push(ch);
            }
        }
        return stack;
    }
}
