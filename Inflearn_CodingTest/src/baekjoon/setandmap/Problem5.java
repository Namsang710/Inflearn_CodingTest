package baekjoon.setandmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

// 듣보잡
public class Problem5 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for(int i=0; i<n; i++){
            set1.add(br.readLine());
        }

        for(int i=0; i<m; i++){
            set2.add(br.readLine());
        }

        set1.retainAll(set2);
        System.out.println(set1.size());

        StringBuilder sb = new StringBuilder();
        if(!set1.isEmpty()){
            String arr[] = set1.toArray(new String[0]);
            Arrays.sort(arr);
            for(String str : arr)
                sb.append(str).append("\n");
        }

        System.out.println(sb);

    }
}
