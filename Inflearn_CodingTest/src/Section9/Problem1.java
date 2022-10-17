package Section9;

import java.util.Scanner;

public class Problem1 {

    static String answer = "NO";

    static int total = 0;
    static int [] array;

    public void solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        array = new int[n];

        for(int i=0; i<array.length; i++){
            array[i] = s.nextInt();
            total += array[i];
        }

        DFS(0, 0);
        System.out.println(answer);
    }


    public void DFS(int level, int sum){
        if(sum > total/2) return;

        if(answer.equals("YES")) return;
        else{
            if (level == array.length){
                if (total - sum == sum)
                    answer = "YES";
            }else{
                DFS(level + 1, sum + array[level]);
                DFS(level + 1, sum);
            }

        }

    }
}
