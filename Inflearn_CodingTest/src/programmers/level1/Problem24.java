package programmers.level1;

import java.util.Arrays;


// 실패율
public class Problem24 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] arr = new int[N+2];
        double[] fail = new double[N+2];

        for(int i=0; i<stages.length; i++){
            int stage = stages[i];

            for(int j=1; j<=stage; j++){
                arr[j]++;
            }
        }

        for(int i=1; i< arr.length - 1; i++){
            if(arr[i] - arr[i+1] == 0){
                fail[i] = 0;
            }else{
                fail[i] = (double) (arr[i]- arr[i+1])/ arr[i];
            }
        }

        fail[0] = -1;
        fail[fail.length-1] = -1;

        for(int i=0; i<answer.length; i++){
            double max = Arrays.stream(fail).max().getAsDouble();
            for(int j=1; j<fail.length-1; j++){
                if(max == fail[j]){
                    fail[j] = -1;
                    answer[i] = j;
                    break;
                }
            }
        }


        return answer;
    }
}
