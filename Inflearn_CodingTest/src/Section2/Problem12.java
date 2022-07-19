package Section2;

import java.util.Scanner;

public class Problem12 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int answer = 0;
        int [][] ranks = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ranks[i][j] = s.nextInt();
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt = 0;

                for(int k=0; k<m; k++){
                    int pi=0, pj=0;
                    for(int l=0; l<n; l++){
                        if(ranks[k][l] == i) pi = l;
                        if(ranks[k][l] == j) pj = l;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }
}
