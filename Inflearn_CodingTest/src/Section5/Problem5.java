package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Problem5 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        String str = s.next();

        Stack<Character> stack = new Stack<>();

        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                stack.push('(');
            else {
                stack.pop();
                if (str.charAt(i - 1) == '(') answer += stack.size();
                else answer++;
            }

        }
        return answer;
    }
}
