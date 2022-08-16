package Section6;

import java.util.Scanner;

public class Problem3 {
    public int [] solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(arr[j-1] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }

        return arr;

    }
}
