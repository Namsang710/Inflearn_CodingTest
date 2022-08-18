package Section6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem5 {
    public String answer() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        List<Integer> arr = new ArrayList<>();

        String answer = "U";

        for(int i=0; i<n; i++)
            arr.add(s.nextInt());


        while(!arr.isEmpty()){
            int num = arr.remove(0);

            if(arr.contains(num)){
                answer = "D";
                break;
            }

        }

        return answer();


    }
}
