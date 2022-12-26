package programmers.level1;

// 로또의 최고 순위와 최저 순위
public class Problem16 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int zeroCnt = 0;
        int correctCnt = 0;
        for(int i=0; i< lottos.length; i++){

            if(lottos[i] == 0)
                zeroCnt++;
            else{
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        correctCnt++;
                        break;
                    }
                }
            }
        }

        answer[0] = (zeroCnt+correctCnt) > 1 ? 7-(zeroCnt+correctCnt) : 6;
        answer[1] = (correctCnt) > 1 ? 7-correctCnt : 6;

        return answer;
    }
}
