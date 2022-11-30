package baekjoon.setandmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Problem4 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st1.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        int arr[] = new int[m];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int key : arr){
            sb.append(map.getOrDefault(key, 0)).append(" ");
        }
        System.out.println(sb);
    }
}
