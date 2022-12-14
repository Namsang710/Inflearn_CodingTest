package baekjoon.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem2 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        int arr[] = new int[n];
        int sum[] = new int[n-k+2];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());

            if(i > k-1){
                sum[i-k+2] = sum[i-k+1] + arr[i] - arr[i-k];
            }else if(i < k-1){
                sum[0] += arr[i];
            }else{
                sum[i-k+2] = sum[i-k+1] + arr[i];
            }
        }

        sum[0] = Integer.MIN_VALUE;
        int result = Arrays.stream(sum)
                .max()
                .getAsInt();

        System.out.println(result);

    }
}
