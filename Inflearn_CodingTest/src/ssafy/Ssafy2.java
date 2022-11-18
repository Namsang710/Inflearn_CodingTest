package ssafy;

import java.util.Scanner;

public class Ssafy2 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();

        int arr[][] = new int[N][N];


        for (int i=0; i<N; i++){
            for(int j=0; j<N; j++)
                arr[i][j] = s.nextInt();
        }

        int result = Integer.MIN_VALUE;

        for(int i=0; i<=N-M; i++){
            int sum = 0;
            for(int j=0; j<N-M; j++){
                for(int k=i; k<M; k++){
                    sum += arr[j][k];
                }
            }
            result = Math.max(result, sum);
        }

        return result;
    }
}
