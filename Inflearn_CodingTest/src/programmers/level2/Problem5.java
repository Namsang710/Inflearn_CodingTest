package programmers.level2;

// 이진 변환 반복하기
public class Problem5 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        String str = s;
        while(!str.equals("1")){
            String tmp = str.replaceAll("0", "");
            answer[1] += str.length() - tmp.length();

            int num = tmp.length();
            str = Integer.toBinaryString(num);

            answer[0]++;
        }
        return answer;
    }
}
