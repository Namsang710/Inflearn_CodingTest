package Section8;

import java.util.Scanner;

public class Problem6 {
    static int[] pm, ch, arr;
    static int n, m;
    public void DFS(int L){
        if (L == m){
            for(int x : pm)
                System.out.print(x + " ");
            System.out.println();
        }else{
            for (int i=0; i<n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }

            }
        }

    }


    public void solution(){
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        arr = new int[n];
        ch = new int[n];
        pm = new int[m];

        for(int i=0; i<n; i++) arr[i] = s.nextInt();
        DFS(0);
    }

}
