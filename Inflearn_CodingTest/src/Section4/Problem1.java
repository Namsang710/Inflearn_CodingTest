package Section4;

import java.util.HashMap;
import java.util.Scanner;

public class Problem1 {
    public char solution() {
        Scanner s = new Scanner(System.in);
        char answer = ' ';

        int n = s.nextInt();
        String str = s.next();

        HashMap<Character, Integer> map = new HashMap();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        int cnt = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(cnt < map.get(key)){
                cnt = map.get(key);
                answer = key;
            }
        }

        return answer;

    }
}
