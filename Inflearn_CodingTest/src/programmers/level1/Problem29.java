package programmers.level1;

// 비밀지도
public class Problem29 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            int num1 = arr1[i];
            int num2 = arr2[i];

            for(int j=n-1; j>=0; j--){
               if(num1 >= 0){
                   arr[i][j] += num1 % 2;
                   num1 /= 2;
               }
               if(num2 >= 0){
                   arr[i][j] += num2 % 2;
                   num2 /= 2;
               }
            }
        }

        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                if (arr[i][j] == 0)
                    sb.append(" ");
                else
                    sb.append("#");
            }
            answer[i] = sb.toString();
        }


        return answer;
    }
}
