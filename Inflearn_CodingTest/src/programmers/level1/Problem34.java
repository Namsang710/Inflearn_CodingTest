package programmers.level1;

// 하샤드 수
public class Problem34 {
    public boolean solution(int x) {

        int sum = 0;
        int tmp = x;
        while(tmp > 0){
            sum += tmp % 10;
            tmp /= 10;
        }

        return x % sum == 0;
    }
}
