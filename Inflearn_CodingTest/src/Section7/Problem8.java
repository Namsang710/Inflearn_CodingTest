package Section7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem8 {

    public void solution() {
        Scanner s = new Scanner(System.in);

        int p1 = s.nextInt();
        int p2 = s.nextInt();

        System.out.println(BFS(p1, p2));

    }

    public int BFS(int p1, int p2) {

        Queue<Integer> q = new LinkedList<>();
        int[] dis = {1, -1, 5};

        int level = 0;
        int[] ch = new int[10001];
        ch[p1] = 1;
        q.offer(p1);

        while (!q.isEmpty()) {
            int l = q.size();
            for (int i=0; i<l; i++){
                int x = q.poll();
                for (int j = 0; j < dis.length; j++) {
                    int disX = x + dis[j];
                    if (disX == p2) return level + 1;
                    if(disX >= 1 && disX <= 10000 && ch[disX] == 0){
                        q.offer(disX);
                        ch[disX] = 1;
                    }
                }
            }
            level++;
        }

        return 0;
    }

}

