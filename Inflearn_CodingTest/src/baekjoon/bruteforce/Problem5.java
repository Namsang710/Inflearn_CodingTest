package baekjoon.bruteforce;

import java.util.Scanner;

public class Problem5 {
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        int pos = 665;

        while (cnt < n) {
            pos++;
            int tmp = pos;
            int cnt6 = 0;

            boolean flag = false;
            while (tmp > 0) {
                if (tmp % 10 == 6) {
                    cnt6++;
                    if (cnt6 >= 3)
                        flag = true;
                } else {
                    if (cnt6 >= 3)
                        flag = true;
                    cnt6 = 0;
                }
                tmp = tmp / 10;
            }

            if (flag)
                cnt++;
        }
        System.out.println(pos);

    }
}
