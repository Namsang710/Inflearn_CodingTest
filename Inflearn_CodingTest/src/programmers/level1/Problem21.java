package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 두 개 뽑아서 더하기
public class Problem21 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){

            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }

        Integer[] list = set.toArray(new Integer[0]);
        Arrays.sort(list);
        answer = Arrays.stream(list).mapToInt(i->i).toArray();
        return answer;
    }
}
