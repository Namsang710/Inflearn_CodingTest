package Section1;

import java.util.ArrayList;
import java.util.Scanner;

// 단어 뒤집기
public class Problem4 {
    public ArrayList<String> solution(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        String[] strings = new String[n];
        ArrayList<String> answers = new ArrayList<String>();

        for (int i=0; i<n; i++){
            strings[i] = s.nextLine();
        }

        for (String string : strings){
            String answer = new StringBuilder(string).reverse().toString();
            answers.add(answer);
        }

        return answers;
    }
}
