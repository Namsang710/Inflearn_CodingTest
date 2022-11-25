package baekjoon.recursive;

import java.util.Scanner;

public class Problem3 {
    static int cnt = 0;
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String arr[] = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        for(int i=0; i<n; i++){
            cnt = 0;
            System.out.println(isPalindrome(arr[i], 0, arr[i].length() - 1) + " " + cnt);
        }
    }


    public int isPalindrome(String s, int l, int r){
        cnt++;
        if(l >= r)
            return 1;
        else if(s.charAt(l) != s.charAt(r))
            return 0;
        else
            return isPalindrome(s, l+1, r-1);
    }
}
