package programmers.level1;

import java.util.Arrays;

// 명예의 전당
public class Problem3 {
    public int[] solution(int k, int[] score){
        int[] answer = new int[score.length];
        int[] honor = new int[k];

        for(int i=0; i< honor.length; i++)
            honor[i] = Integer.MAX_VALUE;

        for(int i=0; i<score.length; i++){
            if(i < k){
                honor[i] = score[i];
            }else{
                if(honor[0] < score[i])
                    honor[0] = score[i];
            }
            Arrays.sort(honor);
            answer[i] = honor[0];
        }

        return answer;
    }
}
