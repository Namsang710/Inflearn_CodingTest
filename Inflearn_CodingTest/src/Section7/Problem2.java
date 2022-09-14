package Section7;

import java.util.Scanner;

public class Problem2 {

    public void solution() {
        Scanner s = new Scanner(System.in);

        DFS(s.nextInt());
    }

    public void DFS(int n){
        if(n == 0)
            return;
        else{
            DFS(n/2);
            System.out.print(n % 2);
        }
    }
}
