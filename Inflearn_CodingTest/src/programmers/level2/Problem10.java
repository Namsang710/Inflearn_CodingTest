package programmers.level2;

import java.util.Arrays;

// 구명보트
public class Problem10 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int weight = 0;
        Arrays.sort(people);
        int lt = 0;
        int rt = people.length - 1;
        while(lt <= rt){
            if(people[rt] >= limit){
                answer++;
                rt--;
            }else{
                if(people[lt] + people[rt] > limit){
                    answer++;
                    rt--;
                }
                else{
                    answer++;
                    lt++; rt--;
                }
            }

        }

        return answer;
    }
}
