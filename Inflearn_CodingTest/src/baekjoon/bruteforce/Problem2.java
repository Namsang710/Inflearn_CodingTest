package baekjoon.bruteforce;

import java.util.Scanner;

// 분해합
public class Problem2 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int  N = sc.nextInt();


        int result = Integer.MAX_VALUE;
        for(int i=1; i<N; i++){
            int a = i;
            int sum = i;
            while(a > 10){
                sum += a % 10;
                a /= 10;
            }
            sum += a;
            if (sum == N)
                result = Math.min(result, i);
        }
        if (result == Integer.MAX_VALUE)
            result = 0;

        System.out.println(result);
    }

}
