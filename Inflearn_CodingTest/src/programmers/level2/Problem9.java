package programmers.level2;

import java.util.HashMap;

// 영어 끝말잇기
public class Problem9 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0 ,0};

        HashMap<String, Integer> hashMap = new HashMap<>();
        int num = 0;
        for(int i=0; i<words.length; i++){
            num++;
            if(num > n)
                num = 1;
            int i1 = (i + 1) % n == 0 ? (i + 1) / n : (i + 1) / n + 1;
            if(i > 0){
                if(words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)){
                    answer[0] = num;
                    answer[1] = i1;
                    break;

                }
            }

            if(hashMap.containsKey(words[i])){
                answer[0] = num;
                answer[1] = i1;
                break;
            }else{
                hashMap.put(words[i], 1);
            }

        }

        return answer;
    }
}
