package programmers.level1;

// 부족한 금액 계산하기
public class Problem13 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long sum = 0;
        for (int i=1; i<=count; i++){
            sum += price * i;
        }

        if (sum > money){
            answer = sum - money;
        }else{
            answer = 0;
        }


        return answer;
    }

}
