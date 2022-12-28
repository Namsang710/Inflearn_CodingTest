package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

// 모의고사
public class Problem26 {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] cnt = new int[3];

        for(int i=0; i<answers.length; i++){
            if(answers[i] == student1[i%student1.length])
                cnt[0]++;
            if(answers[i] == student2[i%student2.length])
                cnt[1]++;
            if(answers[i] == student3[i%student3.length])
                cnt[2]++;
        }


        int max = Arrays.stream(cnt).max().getAsInt();
        int maxCnt = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<cnt.length; i++){
            if(cnt[i] == max){
                list.add(i+1);
                maxCnt++;
            }
        }

        int[] answer = new int[maxCnt];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
