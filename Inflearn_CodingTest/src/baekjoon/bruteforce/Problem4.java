package baekjoon.bruteforce;

import java.util.Scanner;

// 체스판 다시 칠하기
public class Problem4 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char arr[][] = new char[n][m];
        for(int i=0; i<n; i++){
            String tmp = sc.next();
            for(int j=0; j<m; j++){
                arr[i][j] = tmp.charAt(j);
            }
        }

        int result = Integer.MAX_VALUE;
        int cnt = 1;
        for(int l=0; l<=n-8; l++){
            for(int j=0; j<=m-8; j++) {
                int white = 0;
                int black = 0;
                for (int i = l; i < 8 + l; i++) {
                    if (black > result && white > result)
                        break;
                    for (int k = j; k < 8 + j; k++) {
                        if (cnt % 2 == 1) {
                            if (arr[i][k] == 'W') {
                                black++;
                            } else {
                                white++;
                            }
                        } else {
                            if (arr[i][k] == 'W') {
                                white++;
                            } else {
                                black++;
                            }
                        }
                        cnt++;
                    }
                    cnt++;
                }
                int a = Math.min(white, black);
                result = Math.min(result, a);
            }
        }
        System.out.println(result);
    }
}
