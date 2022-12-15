package baekjoon.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기5
public class Problem5 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int t = Integer.parseInt(st1.nextToken());

        int sum[][] = new int[n+1][n+1];

        for(int i=1; i<n+1; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for(int j=1; j<n+1; j++){
                int num = Integer.parseInt(st2.nextToken());
                sum[i][j] = sum[i][j-1] + num;
            }

        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st3.nextToken());
            int y1 = Integer.parseInt(st3.nextToken());
            int x2 = Integer.parseInt(st3.nextToken());
            int y2 = Integer.parseInt(st3.nextToken());

            int result = 0;
            for(int j=x1; j<=x2; j++){
                result += (sum[j][y2] - sum[j][y1-1]);
            }
            sb.append(result).append("\n");
        }

        System.out.println(sb);

    }
}
