package programmers.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 크레인 인형뽑기 게임
public class Problem23 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Stack<Integer>> boards= new ArrayList<>();

        for(int i=0; i< board.length; i++){
            boards.add(new Stack());
            for(int j=board[i].length-1; j>=0; j--){
                if (board[j][i] != 0){
                    boards.get(i).push(board[j][i]);
                }
            }
        }


        Stack<Integer> stack = new Stack<>();
        for(int i=0; i< moves.length; i++){
            if(!boards.get(moves[i]-1).isEmpty()){
                int doll = boards.get(moves[i]-1).pop();

                if(!stack.empty() && doll == stack.peek()){
                    answer += 2;
                    stack.pop();
                }else{
                    stack.push(doll);
                }
            }
        }
        return answer;
    }
}
