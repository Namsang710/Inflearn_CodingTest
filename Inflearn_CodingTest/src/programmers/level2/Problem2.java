package programmers.level2;

import java.util.Locale;
import java.util.StringTokenizer;

// Jadencase 문자열 만들기
public class Problem2 {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.startsWith(" ")){
                sb.append(str);
                continue;
            }
            str = str.toLowerCase(Locale.ROOT);
            char[] tmp = str.toCharArray();
            if(Character.isAlphabetic(str.charAt(0))){
                tmp[0] = Character.toUpperCase(str.charAt(0));
            }
            sb.append(tmp);
        }
        return sb.toString();
    }
}
