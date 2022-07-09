package Section2;

import java.util.Scanner;

public class Problem5 {
    public int solution(){
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int [] ch = new int[size+1];
        int answer = 0;

        for(int i=2; i<=size; i++){
            if(ch[i] == 0){
                answer++;
                for(int j=i; j<=size; j=j+i)
                    ch[j] = 1;
            }
        }

        return answer;
    }
}
