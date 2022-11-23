package baekjoon.math;

import java.util.Scanner;

public class Problem3 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int H[] = new int[T];
        int W[] = new int[T];
        int N[] = new int[T];


        for(int i=0; i<T; i++){
            H[i] = sc.nextInt();
            W[i] = sc.nextInt();
            N[i] = sc.nextInt();
        }

        for(int i=0; i<T; i++){
            int h = N[i] % H[i];
            int w = N[i] / H[i] + 1;

            if (h == 0){
                h = H[i];
                w = N[i] / H[i];
            }

            if (w < 10){
                System.out.println(h + "0" + w);
            }else {
                System.out.println(h + "" + w);
            }
        }
    }
}
