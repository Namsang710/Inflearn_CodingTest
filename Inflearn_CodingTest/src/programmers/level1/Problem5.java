package programmers.level1;

// 푸드 파이트 대회
public class Problem5 {
    public String solution(int[] food){
        String answer = "";
        for(int i=1; i< food.length; i++){

            if (food[i] > 1){
                for(int j=1; j <= food[i]/2; j++){
                    answer += i;
                }
            }
        }
        answer += 0;

        for(int i=answer.length()-2; i>=0; i--)
            answer += answer.charAt(i);
        return answer;
    }
}
