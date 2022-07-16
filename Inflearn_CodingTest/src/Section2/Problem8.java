package Section2;

import java.util.Scanner;

public class Problem8 {
    public int [] solution() {
        Scanner s = new Scanner(System.in);

        int [] scores = new int[s.nextInt()];
        int [] ranks = new int[scores.length];


        for (int i=0; i< scores.length; i++)
            scores[i] = s.nextInt();

        for (int i=0; i<scores.length; i++){
            ranks[i]++;

            for (int j=0; j< scores.length; j++){
                if(scores[i] < scores[j])
                    ranks[i]++;
            }
        }
        return ranks;
    }
}
