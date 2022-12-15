package baekjoon.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 신나는 함수 실행
public class Problem2 {

    public static long[][][] arr = new long[21][21][21];

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();


        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1 && c == -1)
                break;

            long result = DFS(a, b, c);

            String str = "w(" + a + ", "+ b +", "+ c +") = " + result;
            sb.append(str).append('\n');
        }

        System.out.println(sb);
    }

    public static long DFS(int a, int b, int  c){

        if( a <= 0 || b <= 0 || c <= 0)
            return 1;

        else if(a > 20 || b > 20 || c > 20)
            return DFS(20, 20, 20);

        else if (arr[a][b][c] > 0)
            return arr[a][b][c];

        else if(a < b && b < c){
            return arr[a][b][c] = DFS(a, b, c-1) + DFS(a, b-1, c-1) - DFS(a, b-1, c);
        }
        else{
            return arr[a][b][c] = DFS(a-1, b, c) + DFS(a-1, b-1, c) + DFS(a-1, b, c-1) - DFS(a-1, b-1, c-1);
        }
    }
}
