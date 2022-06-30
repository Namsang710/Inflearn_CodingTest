package Section1;

import java.util.Scanner;

public class Problem6 {
    public String solution() {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String answer = "";

        for (int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i)
                answer += str.charAt(i);
        }

        return answer;
    }
}
