package baekjoon.dynamic;

import java.util.Scanner;

// 알고리즘 수업 - 피보나치 수 1
public class Problem1 {
    static long[] fibo;

    static int count1 = 0;
    static int count2 = 0;

    public void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fibo = new long[n + 1];

        DFS1(n);
        DFS2(n);

        System.out.println(count1 + " " + count2);
    }

    public static long DFS1(int n){
        if(n == 1 || n == 2){
            count1++;
            return 1;
        }
        else{
            return DFS1(n-1) + DFS1(n-2);
        }
    }
    public static long DFS2(int n){
        if (fibo[n] > 0)
            return fibo[n];
        if(n == 1 || n == 2){
            return fibo[n] = 1;
        }
        else{
            count2++;
            return fibo[n] = DFS2(n-1) + DFS2(n-2);
        }
    }
}
