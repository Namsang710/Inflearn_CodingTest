package Section7;

import java.util.Scanner;

public class Problem4 {
    static int[] fibo;
    public void solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        fibo = new int[n+1];

        DFS(n);
        for(int i=1; i<=n; i++){
            System.out.print(fibo[i] + " ");
        }

    }

    public int DFS(int n){

        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else{
            return fibo[n] = DFS(n -2) + DFS(n-1);
        }


    }
}
