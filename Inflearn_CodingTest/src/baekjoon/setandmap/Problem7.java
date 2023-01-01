package baekjoon.setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Problem7 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        HashSet<String> set = new HashSet<>();

        for(int i=1; i<=str.length(); i++){
            for(int j=0; j+i<=str.length(); j++){
                String tmp = str.substring(j, j+i);
                set.add(tmp);
            }
        }

        System.out.println(set.size());
    }
}
