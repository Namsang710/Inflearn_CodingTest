package Section1;

import java.util.Locale;
import java.util.Scanner;

public class Problem11 {
    public String solution() {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().toUpperCase(Locale.ROOT);
        String answer = "";

        int i=0;

        while(i<str.length()){
            int count = 0;

            while(true){
                if( i+count < str.length() && str.charAt(i) == str.charAt(i + count)){
                    count++;
                }else
                    break;
            }

            answer += str.charAt(i);
            if (count > 1){
                answer += count;
            }
            i += count;
        }
        return answer;
    }
}
