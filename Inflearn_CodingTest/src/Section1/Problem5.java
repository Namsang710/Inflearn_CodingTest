package Section1;

import java.util.Scanner;

public class Problem5 {

    public String solution() {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        char[] chArray = str.toCharArray();

        int lp = 0, rp = chArray.length - 1;

        while(true){
            if (lp > rp)
                break;

            if(Character.isLetter(chArray[lp]) && Character.isLetter(chArray[rp])){
                char tmp = chArray[lp];
                chArray[lp] = chArray[rp];
                chArray[rp] = tmp;

                rp--;
                lp++;
            }else if (Character.isLetter(chArray[lp]) || Character.isLetter(chArray[rp])){
                if (Character.isLetter(chArray[lp])){
                    rp--;
                }else{
                    lp++;
                }
            }else{
                rp--;
                lp++;
            }
        }
        String answer = String.valueOf(chArray);
        return answer;
    }

}
