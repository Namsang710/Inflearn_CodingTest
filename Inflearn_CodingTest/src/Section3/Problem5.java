package Section3;

import java.util.Scanner;

public class Problem5 {
    public int solution() {

        Scanner s = new Scanner(System.in);

        int checkSum = s.nextInt();
        int answer = 0;

        int sum = 0, lt = 1;

        for(int i=1; i<checkSum; i++){
            sum += i;

            if(sum==checkSum) answer++;

            while(sum >= checkSum){
                sum -= lt++;
                if(sum == checkSum) answer++;
            }

        }

        return answer;
    }
}
