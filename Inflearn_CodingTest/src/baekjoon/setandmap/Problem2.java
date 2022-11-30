package baekjoon.setandmap;

import java.util.HashSet;
import java.util.Scanner;

public class Problem2 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<String> hashSet = new HashSet();

        for(int i=0; i<n; i++){
            hashSet.add(sc.next());
        }

        int result = 0;
        for(int i=0; i<m; i++){
            String str = sc.next();
            if(hashSet.contains(str))
                result++;
        }

        System.out.println(result);
    }
}
