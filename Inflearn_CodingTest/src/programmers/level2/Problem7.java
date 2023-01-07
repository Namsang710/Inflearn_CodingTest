package programmers.level2;

public class Problem7 {
    static long [] fibo;
    public int solution(int n) {
        int answer = 0;

        fibo = new long[n+1];
        fibo(n);

        answer = (int) fibo[n];

        return answer;
    }


    public long fibo(int n){
        if (fibo[n] > 0)
            return fibo[n];
        if(n == 1 || n == 2){
            return fibo[n] = 1;
        }else{
            return fibo[n] = (fibo(n-1) + fibo(n-2)) % 1234567;
        }
    }
}
