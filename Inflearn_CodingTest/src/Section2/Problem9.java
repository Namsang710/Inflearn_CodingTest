package Section2;

import java.util.Scanner;

public class Problem9 {
    public int solution() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();


        int [][] grating = new int [size][size];
        int sum1, sum2;
        int answer = Integer.MIN_VALUE;

        for(int i=0; i<size; i++)
            for(int j=0; j<size; j++)
                grating[i][j] = s.nextInt();

        for (int i=0; i<size; i++){
            sum1 = sum2 = 0;

            for(int j=0; j<size; j++){
                sum1 += grating[i][j];
                sum2 += grating[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for(int i=0; i<size; i++)
            sum1 += grating[i][i];
        for(int i=size-1; i>=0; i--)
            sum2 += grating[i][i];

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}
