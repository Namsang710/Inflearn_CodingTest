package Section4;

import java.util.HashMap;
import java.util.Scanner;

public class Problem4 {
    public int solution(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        String t = s.next();

        HashMap<Character, Integer> hashMap1 = new HashMap();
        HashMap<Character, Integer> hashMap2 = new HashMap();

        int answer = 0;

        for(char ch : t.toCharArray()){
            hashMap1.put(ch, hashMap1.getOrDefault(ch, 0) + 1);
        }

        int l = t.length() - 1;
        for(int i=0; i<l; i++){
            hashMap2.put(str.charAt(i), hashMap2.getOrDefault(str.charAt(i), 0) + 1);
        }

        int lt = 0;
        for(int rt=l; rt<str.length(); rt++){
            hashMap2.put(str.charAt(rt), hashMap2.getOrDefault(str.charAt(rt), 0) + 1);

            if(hashMap1.equals(hashMap2)){
                answer++;
            }

            hashMap2.put(str.charAt(lt), hashMap2.get(str.charAt(lt)) - 1);
            if(hashMap2.get(str.charAt(lt)) == 0)
                hashMap2.remove(str.charAt(lt));
            lt++;
        }

        return answer;
    }
}
