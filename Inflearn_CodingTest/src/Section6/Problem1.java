package Section6;

import java.util.Scanner;

public class Problem1 {
    public int [] solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        for(int i=0; i<n; i++){
            int index = i;

            for(int j=i; j<n; j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }

            int num = arr[i];
            arr[i] = arr[index];
            arr[index] = num;
        }

        return arr;
    }
}
