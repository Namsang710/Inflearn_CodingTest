package programmers.level1;

// 크기가 작은 부분 문자열
public class Problem36 {
    public int solution(String t, String p) {
        int answer = 0;

        long numP = Long.parseLong(p);
        for(int i=0; i<=t.length() - p.length(); i++){
            long numT = Long.parseLong(t.substring(i, i+p.length()));
            if (numT <= numP)
                answer++;
        }

        return answer;
    }
}
