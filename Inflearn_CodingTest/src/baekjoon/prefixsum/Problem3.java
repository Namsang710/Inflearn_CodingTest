package baekjoon.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 인간-컴퓨터 상호작용
public class Problem3 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        int sum[][] = new int[26][str.length()+1];
        for(int i=1; i<=str.length(); i++){
            int index = (str.charAt(i-1) - 'a') ;
            for(int j=0; j<26; j++){
               if (j == index){
                   sum[index][i] = sum[index][i-1] + 1;
               }else{
                   sum[j][i] = sum[j][i-1];
               }
            }

        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int index = (st.nextToken().charAt(0) - 'a') ;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0)
                sb.append(sum[index][b+1]).append('\n');
            else
                sb.append(sum[index][b+1] - sum[index][a]).append('\n');

        }

        System.out.println(sb);
    }
}
