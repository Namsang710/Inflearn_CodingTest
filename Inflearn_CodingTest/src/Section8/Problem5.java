package Section8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem5 {

    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] arr){
        if (sum > m) return;
        if(L>=answer) return;
        if (sum == m){
            answer = Math.min(answer, L);
        }else{
                for(int i=0; i<n; i++){
                    DFS(L+1, sum+arr[i], arr);
                }
        }

    }

    public void solution() {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        Integer [] arr = new Integer[n];

        for(int i=0; i<n; i++) arr[i] = s.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());

        m = s.nextInt();

        DFS(0,0, arr);

        System.out.println(answer);
    }
}
