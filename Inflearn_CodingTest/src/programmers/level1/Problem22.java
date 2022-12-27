package programmers.level1;

import java.util.Arrays;

// 키패드 누르기
public class Problem22 {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        Integer[] leftBtn = {1, 4, 7};
        Integer[] rightBtn = {3, 6, 9};
        Integer[] middleBtn = {2, 5, 8, 0};

        int left = 3;
        int right= 3;

        boolean leftHand = false;
        boolean rightHand = false;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numbers.length; i++){
            int number = numbers[i];
            if(number == 1 || number == 4 || number == 7){
                left = Arrays.asList(leftBtn).indexOf(number);
                leftHand = false;
                sb.append("L");

            }else if(number == 3 || number == 6 || number == 9){
                right = Arrays.asList(rightBtn).indexOf(number);
                rightHand = false;
                sb.append("R");
            }else{
                int middle = Arrays.asList(middleBtn).indexOf(number);
                int leftDistance = leftHand? Math.abs(middle - left) -1 : Math.abs(middle - left);
                int rightDistance = rightHand? Math.abs(middle - right) - 1 : Math.abs(middle - right);

                if(leftDistance < rightDistance){
                    left = middle;
                    leftHand = true;
                    sb.append("L");
                }
                else if(leftDistance > rightDistance){
                    right = middle;
                    rightHand = true;
                    sb.append("R");
                }
                else{
                    if(hand.equals("left")){
                        left = middle;
                        leftHand = true;
                        sb.append("L");
                    }
                    else{
                        right = middle;
                        rightHand = true;
                        sb.append("R");
                    }

                }

            }
        }
        answer = sb.toString();
        return answer;
    }
}

