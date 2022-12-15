package baekjoon.recursive;

import java.util.Scanner;

// 피보나치 수 5
public class Problem2 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibo(n));
    }

    public int fibo(int n){
        if (n == 1)
            return 1;
        else if (n==0)
            return 0;
        else
            return fibo(n-1) + fibo(n-2);
    }
}
