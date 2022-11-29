package baekjoon.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int cards[] = new int[N];
        for(int i=0; i<N; i++){
            cards[i] = sc.nextInt();
        }
        int result = 0;

        Arrays.sort(cards);

        for(int i=0; i<N-2; i++){
            int total = cards[i];
            if(total > M)
                break;
            for(int j=i+1; j<N-1; j++){
                total = cards[i] + cards[j];
                if(total > M)
                    break;
                for(int k=j+1; k<N; k++){
                    total = cards[i] + cards[j] + cards[k];
                    if(total > M)
                        break;
                    else{
                        result = Math.max(result, total);
                    }
                }
            }
        }

        System.out.println(result);

    }
}
