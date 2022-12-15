package baekjoon.array;

import java.util.Scanner;

// 색종이
public class Problem3 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[100][100];


        int cnt = 0;
        for(int i=0; i<n; i++){
            int w = sc.nextInt();
            int h = sc.nextInt();

            for(int j=h; j<h+10; j++){
                for(int k=w; k<w+10; k++){
                    if(arr[j][k] == 0) {
                        arr[j][k] = 1;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
