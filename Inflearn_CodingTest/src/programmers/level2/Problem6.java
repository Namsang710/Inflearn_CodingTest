package programmers.level2;

// 숫자의 표현
public class Problem6 {
    public int solution(int n) {
        int answer = 0;
        int[] sum = new int[n+1];

        for(int i=1; i<=n; i++){
            if(i == 1){
                sum[i] = 1;
            }else{
                sum[i] = i + sum[i-1];
            }
        }

        int lt = 0;
        int rt = 1;
        while(rt != n+1){
            int pSum = sum[rt] - sum[lt];

            if(pSum == n){
                answer++;
                lt++;
            }else if (pSum > n){
                lt++;
            }else{
                rt++;
            }
        }

        return answer;
    }
}
