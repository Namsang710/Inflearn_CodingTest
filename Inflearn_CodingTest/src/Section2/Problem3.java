package Section2;

import java.util.Scanner;

public class Problem3 {
    public void solution() {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int [][] info = new int[2][size];

        for(int i=0; i<2; i++){
            for(int j=0; j<size; j++)
                info[i][j] = s.nextInt();
        }

        for(int i=0; i<size; i++){
            if(info[0][i] == 1){
                if(info[1][i] == 1)
                    System.out.println("D");
                else if(info[1][i] == 2)
                    System.out.println("B");
                else
                    System.out.println("A");
            }
            else if (info[0][i] == 2){
                if(info[1][i] == 1)
                    System.out.println("A");
                else if(info[1][i] == 2)
                    System.out.println("D");
                else
                    System.out.println("B");
            }
            else{
                if(info[1][i] == 1)
                    System.out.println("B");
                else if(info[1][i] == 2)
                    System.out.println("A");
                else
                    System.out.println("D");
            }
        }


    }
}
