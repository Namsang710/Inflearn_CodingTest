package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Problem3 {
    public int solution() {
        Scanner s = new Scanner(System.in);

        Stack<Integer> stack = new Stack();
        int answer = 0;

        int n = s.nextInt();

        int [][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = s.nextInt();
            }
        }

        int m = s.nextInt();

        int [] moves = new int[m];
        for(int i=0; i<m; i++)
            moves[i] = s.nextInt();

        for(int i=0; i<m; i++){
            int move = moves[i] - 1;

            int top = 0;
            while(top != n){
                if(board[top][move] == 0){
                    top++;
                }else{
                    if(stack.isEmpty())
                        stack.add(board[top][move]);
                    else{
                        if(stack.peek() == board[top][move]){
                            stack.pop();
                            answer += 2;
                        }else{
                            stack.add(board[top][move]);
                        }
                    }
                    board[top][move] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
