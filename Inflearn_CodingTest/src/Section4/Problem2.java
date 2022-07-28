package Section4;

import java.util.HashMap;
import java.util.Scanner;

public class Problem2 {
    public String solution() {
        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();

        String answer = "YES";

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for(char ch : str1.toCharArray()){
            hashMap1.put(ch, hashMap1.getOrDefault(ch, 0) + 1);
        }

        for(char ch : str2.toCharArray()){
            hashMap2.put(ch, hashMap2.getOrDefault(ch, 0) + 1);
        }

        for(char key : hashMap1.keySet()){
            if(!hashMap1.get(key).equals(hashMap2.getOrDefault(key, -1)))
                answer = "NO";
        }
        return answer;

    }
}
