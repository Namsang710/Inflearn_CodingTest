package baekjoon.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        int arr[] = new int[n+1];
        int sum[] = new int[n+1];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());

            if(i==1)
                sum[i] = arr[1];
            else{
                sum[i] = sum[i-1] + arr[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st3.nextToken());
            int b = Integer.parseInt(st3.nextToken());

            int tmp = sum[b] - sum[a-1];
            sb.append(tmp).append('\n');
        }

        System.out.println(sb);
    }
}
