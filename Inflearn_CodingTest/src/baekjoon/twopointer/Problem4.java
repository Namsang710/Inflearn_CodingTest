package baekjoon.twopointer;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean prime[] = new boolean[n+1];
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        prime[0] = true;
        prime[1] = true;

        for (int i=2; i*i<=n; i++){
            if(!prime[i]){
                for(int j=i*i; j<=n; j+=i) prime[j] = true;
            }
        }

        for(int i=0; i<=n; i++){
            if(!prime[i])
                primeNumbers.add(i);
        }

        int start=0, end = 0;
        int sum = 0;
        int result = 0;

        while(true){
            if (sum >= n){
                sum -= primeNumbers.get(end++);
            }else if(primeNumbers.size() == start){
                break;
            }else{
                sum += primeNumbers.get(start++);
            }

            if(sum == n) result++;
        }

        System.out.println(result);
    }
}
