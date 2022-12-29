package programmers.level1;

// 소수 만들기
public class Problem31 {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean flag = true;
                    for(int l=2; l<sum; l++){
                        if (sum % l == 0){
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        answer++;

                }
            }
        }


        return answer;
    }
}
