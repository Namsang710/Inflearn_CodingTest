package Section7;

import java.util.Scanner;

public class Problem1 {
    public void solution() {
        Scanner s = new Scanner(System.in);

        int sum = DFS(s.nextInt());


        System.out.println(sum);
    }

    public static int DFS(int n){
        if (n==0)
            return 0;
        else{
            return n + DFS(n-1);
        }
    }
}
