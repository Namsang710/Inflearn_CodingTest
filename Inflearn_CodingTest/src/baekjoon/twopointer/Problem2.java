package baekjoon.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 두 용액
public class Problem2 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int lt = 0;
        int rt = arr.length - 1;

        int resultLt = -1;
        int resultRt = -1;
        int tmp = Integer.MAX_VALUE;

        while(lt < rt){
            int sum = arr[lt] + arr[rt];

            if(Math.abs(sum) < Math.abs(tmp)){
                tmp = sum;
                resultLt = lt;
                resultRt = rt;
            }
            if (sum > 0)
                rt--;
            else if(sum < 0)
                lt++;
            else{
                resultLt = lt;
                resultRt = rt;
                break;
            }
        }

        System.out.println(arr[resultLt] + " " + arr[resultRt]);
    }
}
