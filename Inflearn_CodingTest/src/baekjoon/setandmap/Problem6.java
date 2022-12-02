package baekjoon.setandmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem6 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            set1.add(Integer.parseInt(st2.nextToken()));
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            set2.add(Integer.parseInt(st3.nextToken()));
        }

        HashSet<Integer> set3 = new HashSet<>(set1);
        set1.removeAll(set2);
        set2.removeAll(set3);
        set1.addAll(set2);

        System.out.println(set1.size());


    }
}
