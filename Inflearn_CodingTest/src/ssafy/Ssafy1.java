package ssafy;

import java.util.Scanner;

public class Ssafy1 {
    static int n;
    static int num = 1;

    public  void solution() {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        int [][] answer = new int[n][n];

        move(answer);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                System.out.print(answer[i][j] + " ");
            System.out.println();
        }


    }
    public void move(int[][] answer){
        String direction = "RIGHT";
        int x = 0, y = 0;
        while(num <= n*n){
            switch (direction){
                case "RIGHT" :
                    if(x < n && answer[y][x] == 0){
                        answer[y][x] = num++;
                        x++;
                    }else{
                        x--;
                        y++;
                        direction = "DOWN";
                    }
                    break;
                case "DOWN" :
                    if(y < n && answer[y][x] == 0){
                        answer[y][x] = num++;
                        y++;
                    }else{
                        y--;
                        x--;
                        direction = "LEFT";
                    }
                    break;
                case "LEFT" :
                    if(x >= 0 && answer[y][x] == 0){
                        answer[y][x] = num++;
                        x--;
                    }else{
                        x++;
                        y--;
                        direction = "UP";
                    }
                    break;
                case "UP" :
                    if(y >= 0 && answer[y][x] == 0){
                        answer[y][x] = num++;
                        y--;
                    }else{
                        y++;
                        x++;
                        direction = "RIGHT";
                    }
                    break;
            }
        }
    }
}
