package Section2;

import java.util.Scanner;

public class Problem2 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int [] height = new int[size];

        for(int i=0; i<height.length; i++){
            height[i] = s.nextInt();
        }

        int max = 0, count = 0;

        for(int i=0; i<height.length; i++){
            if(height[i] > max){
                max = height[i];
                count++;
            }
        }
        return count;
    }
}
