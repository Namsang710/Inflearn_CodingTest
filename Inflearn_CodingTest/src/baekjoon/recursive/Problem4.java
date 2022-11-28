package baekjoon.recursive;

import java.util.Scanner;

public class Problem4 {
    static char arr[][];

    public void solution(){
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(); //sysout 으로 출력하면 시간 제한 걸림
        int n = sc.nextInt();
        arr = new char[n][n];
        printStar(n, 0, 0);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sb.append(arr[i][j] == '*' ? '*' : ' ');
                if (j == n- 1){
                    sb.append('\n');
                }
            }
        }
        System.out.print(sb);
    }

    public void printStar(int n, int x, int y){
        if(n == 1){
            arr[x][y] = '*';
            return;
        }
        else{
            int count = 0;
            int size = n/3;

            for(int i=x; i<x+n; i+=size){
                for(int j=y; j<y+n; j+=size){
                    count++;
                    if(count == 5){
                        arr[i][j] = ' ';
                    }else{
                        printStar(size, i, j);
                    }
                }
            }
        }
    }
}
