package programmers.level1;

// 나머지가 1이 되는 수 찾기
public class Problem11 {
    public int solution(int n) {
        int answer = 0;

        for(int i=n-1; i>=2; i--){
            if(n % i == 1)
                answer = i;
        }
        return answer;
    }
}
