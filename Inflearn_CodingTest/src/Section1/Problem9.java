package Section1;

import java.util.Scanner;

public class Problem9 {
    public int solution() {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String answer = "";

        for (int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i)))
                answer += str.charAt(i);
        }

        return Integer.parseInt(answer);

    }
}
