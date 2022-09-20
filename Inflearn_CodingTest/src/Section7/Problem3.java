package Section7;

import java.util.Scanner;

public class Problem3 {
    public void solution() {
        Scanner s = new Scanner(System.in);

        int fact = DFS(s.nextInt());
        System.out.println(fact);

    }

    public  int DFS(int n){
        if (n==1)
            return 1;
        else{
            return n * DFS(n - 1);
        }

    }
}
