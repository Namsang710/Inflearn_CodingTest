package Section3;

import java.util.Scanner;

public class Problem6 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        int [] arr = new int[s.nextInt()];
        int n = s.nextInt();


        for(int i=0; i<arr.length; i++)
            arr[i] = s.nextInt();


        int cnt = 0, lt= 0;
        int answer = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0)
                cnt++;

           if(cnt > n){
               while(cnt > n){
                   if(arr[lt] == 0){
                       cnt--;
                   }
                   lt++;
               }
           }

           answer = Math.max(i - lt + 1, answer);
        }

        return answer;
    }
}
