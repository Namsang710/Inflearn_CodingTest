package Section1;

import java.util.Scanner;

// 문장 속 단어
public class Problem3 {
    public String solution() {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String answer = "";

        String[] strings = str.split(" ");

        for(String string : strings){
            if (string.length() > answer.length())
                answer = string;
        }

        return answer;

    }
}
