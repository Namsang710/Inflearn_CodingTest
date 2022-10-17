package Section8;

import java.util.Scanner;

public class Problem2 {

    static int [] array;
    static int total = 0;

    static int answer = 0;

    public void solution() {
        Scanner s = new Scanner(System.in);

        total = s.nextInt();
        int n = s.nextInt();

        array = new int[n];

        for(int i=0; i<n; i++){
            array[i] = s.nextInt();
        }

        DFS(0, 0);
        System.out.println(answer);
    }

    public void DFS(int level, int sum){
        if(sum > total) return;
        else{
            if (level == array.length){
                if(answer < sum)
                    answer = sum;
            }else{
                DFS(level + 1, sum + array[level]);
                DFS(level + 1, sum);
            }
        }
    }
}
