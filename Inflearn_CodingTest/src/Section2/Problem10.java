package Section2;

import java.util.Scanner;

public class Problem10 {
    public int solution() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt() + 2;

        int[][] heights = new int[size][size];
        int answer = 0;

        for (int i = 1; i < heights.length - 1; i++)
            for (int j = 1; j < heights.length - 1; j++)
                heights[i][j] = s.nextInt();

        for (int i = 1; i < heights.length - 1; i++) {
            for (int j = 1; j < heights.length - 1; j++) {
                int height = heights[i][j];
                if (height > heights[i - 1][j] && height > heights[i + 1][j] && height > heights[i][j - 1] && height > heights[i][j + 1]) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
