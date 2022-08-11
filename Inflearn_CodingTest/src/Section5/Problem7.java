package Section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem7 {
    public String solution() {
        Scanner s = new Scanner(System.in);

        Queue<Character> subject = new LinkedList<>();

        String answer = "YES";

        String str1 = s.next();
        for(char ch : str1.toCharArray()){
            subject.offer(ch);
        }

        String plan = s.next();

        for(char ch : plan.toCharArray()){
            if(subject.contains(ch)){
                if(ch != subject.poll())
                    answer = "NO";
            }
        }
        if(!subject.isEmpty())
            answer = "NO";


        return answer;


    }
}
