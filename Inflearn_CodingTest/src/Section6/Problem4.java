package Section6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    public List<Integer> solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        List<Integer> arr = new ArrayList<>(n);

        int k = s.nextInt();

        for(int i=0; i<k; i++){
            int num = s.nextInt();
            if (arr.contains(num)){
                arr.remove(Integer.valueOf(num));
            }else{
                if(arr.size() == n)
                    arr.remove(n-1);
            }
            arr.add(0, num);

        }

        return arr;
    }
}
