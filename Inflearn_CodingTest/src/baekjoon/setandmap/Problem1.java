package baekjoon.setandmap;

import java.util.HashSet;
import java.util.Scanner;

// 숫자 카드
public class Problem1 {
    public void solution(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> hashSet1 = new HashSet<>();

        for(int i=0; i<n; i++){
            hashSet1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        int arr[] = new int[m];

        for(int i=0; i<m; i++){
            arr[i] = sc.nextInt();
        }

        for(int a : arr){
            if(hashSet1.contains(a)){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }

        }
    }

}
