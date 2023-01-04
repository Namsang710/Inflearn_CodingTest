package programmers.level2;

import java.util.StringTokenizer;

// 최댓값과 최솟값
public class Problem1 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(st.hasMoreTokens()){
            int val = Integer.parseInt(st.nextToken());
            if(val > max)
                max = val;
            if(val < min)
                min = val;
        }

        sb.append(min).append(" ").append(max);
        return sb.toString();
    }
}
