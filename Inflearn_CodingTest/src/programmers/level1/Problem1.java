package programmers.level1;

// 가장 가까운 같은 글자
public class Problem1 {
    public int [] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i=0; i<answer.length; i++){
            int index = -1;
            char ch1 = s.charAt(i);
            for(int j=0; j<i; j++){
                if (ch1 == s.charAt(j)){
                    index = i - j;
                    answer[i] = index;
                }
            }
            if(index == -1)
                answer[i] = index;
        }
        return answer;
    }
}
