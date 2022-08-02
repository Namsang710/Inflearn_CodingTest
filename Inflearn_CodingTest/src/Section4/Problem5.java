package Section4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem5 {
    public int solution() {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        int [] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        TreeSet<Integer> Tset = new TreeSet(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int answer = -1;
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt == k){
                return x;
            }
        }
        return answer;
    }
}
