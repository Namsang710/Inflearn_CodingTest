package programmers.level1;

import java.util.Arrays;

// 삼총사
public class Problem8 {
    public int solution(int[] number) {
        int answer = 0;

        Arrays.sort(number);
        for(int i=0; i<number.length-2; i++){
            int sum = number[i];
            for(int j=i+1; j<number.length-1; j++){
                    sum += number[j];
                    if(sum > 0)
                        break;
                for(int k=j+1; k<number.length; k++){
                    sum += number[k];
                    if(sum > 0){
                        sum -= number[k];
                        break;
                    }
                    else if(sum == 0){
                        answer++;
                    }
                    sum -= number[k];
                }
                sum -= number[j];
            }
        }
        return answer;
    }
}
