package programmers.level1;

import java.util.ArrayList;

// 햄버거 만들기
public class Problem6 {
    public static int solution(int[] ingredient) {
        int answer = 0;

        int[] seq = {1, 3, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<ingredient.length; i++){
            list.add(ingredient[i]);

            boolean flag = true;
            if(ingredient[i] == 1 && list.size() >= 4){
                for(int j=0; j<4; j++){
                    if (list.get(list.size()-j-1) != seq[j]){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    for(int j=0; j<4; j++){
                        list.remove(list.size()-1);
                    }
                }
            }else{
                flag = false;
            }
            if(flag)
                answer++;
        }

        return answer;
    }
}
