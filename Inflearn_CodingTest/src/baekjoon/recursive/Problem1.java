package baekjoon.recursive;

import java.util.Scanner;

// 팩토리얼
public class Problem1 {

    public void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));

    }
    public int fact(int n){
        if(n <= 1)
            return 1;
        else
            return n * fact(n-1);
    }
}
