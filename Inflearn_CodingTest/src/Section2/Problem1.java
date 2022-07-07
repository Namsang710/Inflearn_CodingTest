package Section2;

import java.util.Scanner;

public class Problem1 {
    public void solution() {
        Scanner s = new Scanner(System.in);

        int [] input = new int[s.nextInt()];

        for (int i=0; i<input.length; i++){
            input[i] = s.nextInt();
        }

        for(int i=0; i<input.length; i++){
            if(i == 0)
                System.out.print(input[i] + " ");
            else{
                if(input[i] > input[i-1])
                    System.out.print(input[i] + " ");
            }
        }

    }
}
