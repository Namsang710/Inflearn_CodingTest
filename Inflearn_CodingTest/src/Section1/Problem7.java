package Section1;

import java.util.Locale;
import java.util.Scanner;

public class Problem7 {
    public String solution() {

        Scanner s = new Scanner(System.in);
        String answer = "";

        String str = s.nextLine().toLowerCase(Locale.ROOT);
        String reverseStr = new StringBuilder(str).reverse().toString();

        if(str.equals(reverseStr))
            answer += "YES";
        else
            answer += "NO";

       return answer;
    }
}
