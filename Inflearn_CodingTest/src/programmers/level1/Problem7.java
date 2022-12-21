package programmers.level1;

// 콜라 문제
public class Problem7 {
    public static int solution(int a, int b, int n) {
        int answer = 0;

        int tmp = n;
        while(tmp > a-1){
            int cnt = (tmp / a) * b;
            answer += cnt;

            int tmp2 = tmp;
            tmp = cnt;
            tmp += tmp2 % a;
        }
        return answer;
    }
}
