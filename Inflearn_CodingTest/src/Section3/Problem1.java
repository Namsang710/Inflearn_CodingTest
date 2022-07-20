package Section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public List<Integer> solution() {
        Scanner s = new Scanner(System.in);

        List<Integer> answer = new ArrayList<>();

        int size = s.nextInt();
        int [] arr1 = new int[size];

        for(int i=0; i< arr1.length; i++)
            arr1[i] = s.nextInt();

        size = s.nextInt();
        int [] arr2 = new int[size];

        for(int i=0; i<arr2.length; i++)
            arr2[i] = s.nextInt();

        int p1=0, p2 = 0;

        while(p1 != arr1.length && p2 != arr2.length){
            if(arr1[p1] >= arr2[p2]){
                answer.add(arr2[p2]);
                p2++;
            }
            else{
                answer.add(arr1[p1]);
                p1++;
            }
        }

        if(p1 == arr1.length){
            for(int i=p2; i<arr2.length; i++){
                answer.add(arr2[i]);
            }
        }else{
            for(int i=p1; i<arr1.length; i++){
                answer.add(arr1[i]);
            }
        }

       return answer;

    }
}
