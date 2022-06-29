package Section1;

import java.util.*;

// 대소문자 변환
public class Problem2 {
    public String solution() {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String answer = "";

        for (char ch : str.toCharArray()){
            if(Character.isLowerCase(ch))
                answer += Character.toUpperCase(ch);
            else if(Character.isUpperCase(ch))
                answer += Character.toLowerCase(ch);
        }

        return answer;
    }
}
