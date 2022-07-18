package Section2;

import java.util.Scanner;

public class Problem11 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int [][] students = new int[size][5];
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<size; i++){
            for(int j=0; j<5; j++)
                students[i][j] = s.nextInt();
        }

        for (int i=0; i<size; i++){
            int count = 0;
            for (int j=0; j<size; j++){
                for(int k=0; k<5; k++){
                    if(i != j) {
                        if (students[i][k] == students[j][k]) {
                            count++;
                            break;
                        }
                    }
                }
            }
            if(max < count){
                max = count;
                answer = i+1;
            }
        }

        return answer;
    }
}
