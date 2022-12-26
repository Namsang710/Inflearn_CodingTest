package programmers.level1;

// 3진법 뒤집기
public class Problem20 {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        int tmp = n;
        while(tmp > 0){
            sb.append(tmp%3);
            tmp /= 3;
        }

        String s = sb.toString();
        int cnt = 0;
        for(int i=s.length()-1; i>=0; i--){
            answer += Math.pow(3, cnt) * Integer.parseInt(s.charAt(i) + "");
            cnt++;
        }

        return answer;
    }

}
