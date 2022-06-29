package Section1;

import java.util.*;

// 문자 찾기
public class Problem1 {
    public int solution() {
        int answer = 0;

        Scanner s = new Scanner(System.in);
        String str = s.nextLine().toLowerCase(Locale.ROOT);
        char ch = s.nextLine().toLowerCase(Locale.ROOT).charAt(0);

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == ch)
                answer++;
        }

        return answer;
    }
}
