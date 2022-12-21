package programmers.level1;

import java.util.Arrays;

// 기사단원의 무기
public class Problem4 {
    public int solution(int number, int limit, int power){
        int answer = 0;
        int[] knights = new int[number];

        for(int i=0; i<number; i++){
            int n = i + 1;

            int count = 0;
            for(int j=1; j<=(int)Math.sqrt(n); j++){
                if(n % j == 0){
                   if(j * j == n) count++;
                   else count += 2;
                }
            }

            if(count > limit)
                knights[i] = power;
            else
                knights[i] = count;
        }

        answer = Arrays.stream(knights).sum();
        return answer;
    }
}
