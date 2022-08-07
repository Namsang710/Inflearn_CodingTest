package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Problem4 {
    public int solution() {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        Stack<Integer> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(Integer.parseInt(String.valueOf(ch)));
            }else{
                int n1 = stack.pop();
                int n2 = stack.pop();

                switch (ch){
                    case '+':
                        stack.push(n1+n2);
                        break;
                    case '-':
                        stack.push(n2-n1);
                        break;
                    case '*':
                        stack.push(n1*n2);
                        break;
                    case '/':
                        stack.push(n2/n1);
                        break;
                }
            }
        }

        return stack.peek();
    }
}
