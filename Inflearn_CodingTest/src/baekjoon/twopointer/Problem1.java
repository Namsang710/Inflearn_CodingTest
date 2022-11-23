package baekjoon.twopointer;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int x = sc.nextInt();
        int result = 0;

        int lt = 0;
        int rt = arr.length - 1;
        while(lt < rt){
            if (arr[lt] + arr[rt] == x){
                lt++;
                rt--;
                result++;
            }else if (arr[lt] + arr[rt] > x){
                rt--;
            }else{
                lt++;
            }
        }
        System.out.println(result);
    }
}
