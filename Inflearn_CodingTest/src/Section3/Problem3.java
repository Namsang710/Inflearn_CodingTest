package Section3;

import java.util.Scanner;

public class Problem3 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        int [] arr = new int[s.nextInt()];
        int n = s.nextInt();
        int answer = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }

        for(int i=0; i<n; i++)
            answer += arr[i];

        int sum = answer;

        for(int i=n; i< arr.length; i++){
            sum =  sum -arr[i-n] + arr[i];
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
