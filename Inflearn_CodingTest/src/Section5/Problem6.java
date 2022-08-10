package Section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Problem6 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        Queue<Integer> queue= new LinkedList<Integer>();

        for(int i=1; i<=n; i++){
            queue.offer(i);
        }

        int answer = 0;

        while(!queue.isEmpty()){
            for(int i=1; i<k; i++){
                queue.offer(queue.poll());
            }
            queue.poll();

            if(queue.size() == 1) answer = queue.poll();
        }

        return answer;

    }
}
