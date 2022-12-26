package programmers.level1;

// 숫자 문자열과 영단어
public class Problem14 {
    public int solution(String s) {
        int answer = 0;
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(numbers[i], i+"");
        }

        answer = Integer.parseInt(s);
        return answer;
    }
}
