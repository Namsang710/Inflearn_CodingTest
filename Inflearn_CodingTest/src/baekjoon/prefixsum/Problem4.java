package baekjoon.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나머지합
public class Problem4 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        long[] sum = new long[n+1];
        long[] cnt = new long[m];

        long result = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=1; i<n+1; i++){
            int num = Integer.parseInt(st2.nextToken());

            sum[i] = sum[i-1] + num;

            long tmp = sum[i] % m;
            if(tmp == 0)
                result++;
            cnt[(int)tmp]++;
        }

        for(long num : cnt){
            if (num > 1){
                result += (num * (num-1)) / 2;
            }
        }

        System.out.println(result);
    }
}
