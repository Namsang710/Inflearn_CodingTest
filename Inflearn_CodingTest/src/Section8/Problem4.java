package Section8;


import java.util.Scanner;

public class Problem4 {
    static int[] pm;
    static int n, m;

    public void DFS(int L){
        if (L == m){
            for (int x : pm){
                System.out.print(x + " ");
            }
            System.out.println();
        }else{
            for (int i=1; i<=n; i++){
                pm[L] = i;
                DFS(L+1);
            }

        }

    }

    public void solution() {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        pm = new int[m];

        DFS(0);
    }
}
