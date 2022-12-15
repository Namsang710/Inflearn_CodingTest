package baekjoon.setandmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 나는야 포켓몬 마스터 이다솜
public class Problem3 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> hashMap1 = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();

        String q[] = new String[m];

        for(int i=0; i<n; i++){
            String str = br.readLine();
            hashMap1.put(i+1 + "", str);
            hashMap2.put(str, i+1 + "");
        }

        for(int i=0; i<m; i++){
            q[i] = br.readLine();
        }

        for(int i=0; i<m; i++){
            String str = q[i];
            if(hashMap1.containsKey(str))
                System.out.println(hashMap1.get(str));
            if(hashMap2.containsKey(str))
                System.out.println(hashMap2.get(str));
        }
        br.close();
    }
}
