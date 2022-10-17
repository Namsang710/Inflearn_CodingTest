package Section8;

import java.util.Scanner;

public class Problem3 {

    static int [] scores;

    static int [] times;

    static int maxTime;

    static int answer = 0;
    public void solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        maxTime = s.nextInt();

        scores = new int[n];
        times = new int[n];

        for(int i=0; i<n; i++){
            scores[i] = s.nextInt();
            times[i] = s.nextInt();
        }

        DFS(0, 0, 0);
        System.out.println(answer);
    }

    public void DFS(int level, int sum, int score){
        if(sum > maxTime) return;
        else{
            if(level == times.length){
                if(answer < score)
                    answer = score;
            }else{
                DFS(level + 1, sum + times[level], score + scores[level]);
                DFS(level + 1, sum, score);
            }
        }

    }
}


