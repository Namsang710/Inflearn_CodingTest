package Section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem3 {
    public ArrayList<Integer> solution() {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int k = s.nextInt();
        int [] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList();
        HashMap<Integer, Integer> hashMap = new HashMap();

        for(int i=0; i<k-1; i++){
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for(int rt = k-1; rt<size; rt++){
            hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0) + 1);
            answer.add(hashMap.size());
            hashMap.put(arr[lt], hashMap.get(arr[lt]) -1 );
            if(hashMap.get(arr[lt]) == 0) hashMap.remove(arr[lt]);
            lt++;
        }

      return answer;

    }
}
