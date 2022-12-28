package programmers.level1;

import java.util.Arrays;

// 체육복
public class Problem25 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];

        int lt = 0;
        int rt = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<n; i++){
            student[i] = 1;
            if(lt < lost.length &&  lost[lt] == i+1){
                student[i] -= 1;
                lt++;
            }
            if (rt < reserve.length && reserve[rt] == i+1){
                student[i] += 1;
                rt++;
            }
        }



        for(int i=0; i<student.length; i++){
            if (student[i] == 2){
                if(i>0){
                    if(student[i-1] == 0){
                        student[i-1]++;
                        student[i]--;
                    }else if(i < student.length-1 && student[i+1] == 0){
                        student[i+1]++;
                        student[i]--;
                    }
                }

                else if(i < student.length-1 && student[i+1] == 0) {
                    student[i + 1]++;
                    student[i]--;
                }

            }

        }

        for(int cnt : student){
            if (cnt >= 1){
                answer++;
            }
        }

        return answer;
    }

}
