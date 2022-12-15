package baekjoon.sort;

import java.util.Scanner;

// 수 정렬하기
public class Problem1 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int swap =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
