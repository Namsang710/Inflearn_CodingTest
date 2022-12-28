package programmers.level1;

import java.util.Arrays;

// k번쨰수
public class Problem27 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];
            int index = 0;
            for(int j=commands[i][0]; j<=commands[i][1]; j++){
                arr[index++] = array[j-1];
            }
            Arrays.sort(arr);

            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }
}
