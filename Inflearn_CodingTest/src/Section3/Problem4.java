package Section3;

import java.util.Scanner;

public class Problem4 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        int [] arr = new int[s.nextInt()];
        int checkSum = s.nextInt();

        for(int i=0; i<arr.length; i++)
            arr[i] = s.nextInt();


        int lt = 0;
        int answer=0, sum = 0;

        for(int rt=0; rt<arr.length; rt++){
            sum+= arr[rt];

            if(sum==checkSum) answer++;

            while(sum >= checkSum){
                sum -= arr[lt++];
                if(sum == checkSum) answer++;
            }
        }


        return answer;

    }
}
