package Section6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {

    public int solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);

        int answer = n/2;
        int start = 0, end = n-1;

        while(k != arr[answer]){
            if(arr[answer] == k)
                break;
            else if(k < arr[answer]) {
                end = answer;
            }else{
                start = answer;
            }

            answer = (start + end) / 2;
        }


        return answer + 1;



    }
}
