package programmers.level2;

import java.util.Arrays;

// 최솟값 구하기
public class Problem3 {
    public static void main(String[] args) {
        int []a = {1, 4, 2};
        int []b = {5, 4, 4};
        solution(a, b);
    }

    public static int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<A.length; i++){
            int a = A[i];
            int b = B[B.length-1 -i];
            answer += a * b;
        }

        return answer;
    }
}
