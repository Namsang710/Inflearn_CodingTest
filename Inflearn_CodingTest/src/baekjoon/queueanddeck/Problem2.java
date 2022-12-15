package baekjoon.queueanddeck;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// 카드2
public class Problem2 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<Integer> deque = new LinkedList<>();

        for(int i=1; i<=n; i++)
            deque.addFirst(i);

        while(true){
            if (deque.size() == 1){
                System.out.println(deque.peek());
                break;
            }

            deque.pollLast();

            if(deque.size() == 1){
                System.out.println(deque.peek());
                break;
            }

            deque.addFirst(deque.pollLast());
        }
    }
}
