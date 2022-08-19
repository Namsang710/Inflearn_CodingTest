package Section6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem6 {
    public List<Integer> solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr1[] = new int[n];

        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<n; i++)
            arr1[i] = s.nextInt();

        int arr2[] = Arrays.copyOf(arr1, n);
        Arrays.sort(arr1);

        for(int i=0; i<n; i++){
            if(arr1[i] != arr2[i]){
                answer.add(i+1);
            }
        }

        return answer;

    }
}
