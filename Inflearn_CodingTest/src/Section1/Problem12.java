package Section1;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem12 {
    public String solution() {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        String input = s.next();
        String answer = "";

        ArrayList<String> secrets = new ArrayList();



        for(int i=0; i<input.length(); i+= input.length() / size){
            String str = input.substring(i, i + input.length() / size);
            secrets.add(str);
        }

        for (String str : secrets){
            int digit = Integer.parseInt(str.replaceAll("#", "1").replaceAll("\\*", "0"), 2);
            answer += (char)digit;
        }

        return answer;
    }
}
