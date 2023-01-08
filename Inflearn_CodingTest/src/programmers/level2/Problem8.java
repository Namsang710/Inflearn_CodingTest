package programmers.level2;

import java.util.Stack;

// 짝지어 제거하기
public class Problem8 {
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();

        if(s.length() == 0)
            return 0;

        for(int i=0; i<s.length(); i++){
            if(!stack.empty()){
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }else{
                stack.push(s.charAt(i));
            }
        }

        if(!stack.isEmpty())
            answer = 0;
        else
            answer = 1;

        return answer;
    }
}
