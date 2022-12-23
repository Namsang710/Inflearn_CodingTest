package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;

// 신고 결과 받기
public class Problem10 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, Integer> hashMap = new HashMap<>();
        boolean[][] isReport = new boolean[id_list.length][id_list.length];

        for(int i=0; i< report.length; i++){
            String[] str = report[i].split(" ");

            int reporterIndex = Arrays.asList(id_list).indexOf(str[0]);
            int reportedIndex = Arrays.asList(id_list).indexOf(str[1]);

            if(!isReport[reportedIndex][reporterIndex]){
                hashMap.put(str[1], hashMap.getOrDefault(str[1], 0) + 1);
                isReport[reportedIndex][reporterIndex] = true;
            }
        }

        for(int i=0; i<id_list.length; i++){
            int cnt = hashMap.getOrDefault(id_list[i], 0);

            if (cnt >= k){
                for(int j=0; j< id_list.length; j++){
                    if(isReport[i][j])
                        answer[j]++;
                }

            }
        }

        return answer;
    }
}
