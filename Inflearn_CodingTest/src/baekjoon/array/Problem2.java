package baekjoon.array;

import java.util.Scanner;

// 최댓값
public class Problem2 {
    public void solution(){
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int row = -1;
        int col = -1;
        int result = Integer.MIN_VALUE;

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if (result < arr[i][j]){
                    row = i + 1;
                    col = j + 1;
                    result = arr[i][j];
                }
            }
        }
        System.out.println(result);
        System.out.print(row + " " + col);
        System.out.println();
    }
}
