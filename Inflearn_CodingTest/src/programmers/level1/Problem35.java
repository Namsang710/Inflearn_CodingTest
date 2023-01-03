package programmers.level1;

// 콜라츠 추측
public class Problem35 {
    public int solution(int num) {
        int answer = 0;

        long tmp = num;
        while(tmp != 1){
            if(answer > 500){
                answer = -1;
                break;
            }
            if(tmp % 2 == 0)
                tmp /= 2;
            else
                tmp = tmp * 3 + 1;
            answer++;
        }


        return answer;
    }
}
