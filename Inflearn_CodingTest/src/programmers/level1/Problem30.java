package programmers.level1;

import java.util.Arrays;

// 예산
public class Problem30 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        int num = budget;
        for(int i=0; i<d.length; i++){
            if(num >= d[i]){
                num -= d[i];
                answer++;
            }else break;
        }

        return answer;
    }
}
