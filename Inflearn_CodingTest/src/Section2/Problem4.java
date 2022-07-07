package Section2;

import java.util.Scanner;

public class Problem4 {
    public int[] solution(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] answers = new int[size];


        for(int i=0; i<size; i++){
            answers[i] = 1;
        }

        if(size > 2){
            for(int i=2; i<answers.length; i++){
                answers[i] = answers[i-1] + answers[i-2];
            }
        }

        return answers;

    }
}
