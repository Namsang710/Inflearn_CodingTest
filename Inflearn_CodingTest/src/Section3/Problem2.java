package Section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public List<Integer> solution() {
        Scanner s = new Scanner(System.in);

        int [] arr1 = new int[s.nextInt()];

        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<arr1.length; i++)
            arr1[i] = s.nextInt();

        int [] arr2 = new int[s.nextInt()];

        for(int i=0; i<arr2.length; i++)
            arr2[i] = s.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1=0, p2=0;

        while(p1 != arr1.length && p2 != arr2.length){
            if(arr1[p1] > arr2[p2])
                p2++;
            else if(arr1[p1] < arr2[p2])
                p1++;
            else{
                answer.add(arr1[p1]);
                p1++; p2++;
            }
        }


      return answer;

    }

}
