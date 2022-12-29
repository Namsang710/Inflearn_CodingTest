package programmers.level1;

import java.util.HashMap;

// 완주하지 못한 선수
public class Problem28 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i=0; i<participant.length; i++){
            hashMap.put(participant[i], hashMap.getOrDefault(participant[i], 0) + 1);
        }

        for(int i=0; i<completion.length; i++){
            if (hashMap.containsKey(completion[i])){
                if(hashMap.get(completion[i]) == 1){
                    hashMap.remove(completion[i]);
                }else{
                    hashMap.replace(completion[i], hashMap.get(completion[i])-1);
                }
            }
        }
        String[] arr = hashMap.keySet().toArray(new String[0]);
        answer = arr[0];
        return answer;
    }
}
