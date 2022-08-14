package Section6;

import java.util.Scanner;

public class Problem2 {
    public int [] solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
