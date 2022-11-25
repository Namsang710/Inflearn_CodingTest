package baekjoon.sort;

import java.util.Scanner;

public class Problem3 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[N];

        for(int i=0; i<N; i++)
            arr[i] = sc.nextInt();

        for(int i=0; i<N; i++){
            for(int j=0; j<N-1; j++){
                if(arr[j] < arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }

        System.out.println(arr[k-1]);

    }
}
