package Section2;

import java.util.Scanner;

public class Problem7 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        int answer = 0;

        int [] problems = new int[s.nextInt()];
        int [] scores = new int[problems.length];

        for(int i=0; i< problems.length; i++)
            problems[i] = s.nextInt();

        for(int i=0; i<problems.length; i++){
            if(problems[i] == 1){
                if(i != 0){
                   scores[i] = scores[i-1] + 1;
                }else
                    scores[i] = 1;
            }else
                scores[i] = 0;
        }

        for(int score : scores)
            answer += score;

        return answer;

    }
}
