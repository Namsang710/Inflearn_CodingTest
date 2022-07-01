package Section1;

import java.util.Locale;
import java.util.Scanner;

public class Problem8 {
    public String solution() {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine().toLowerCase(Locale.ROOT);


        int lt= 0;
        int rt = str.length() - 1;
        boolean flag = true;

        while(true){
            if (lt > rt)
                break;

            if (Character.isAlphabetic(str.charAt(lt)) && Character.isAlphabetic(str.charAt(rt))){
                if (str.charAt(lt) != str.charAt(rt)) {
                    flag = false;
                    break;
                }else{
                    lt++;
                    rt--;
                }
            }else if(Character.isAlphabetic(str.charAt(lt)) || Character.isAlphabetic(str.charAt(rt))){
                if (Character.isAlphabetic(str.charAt(lt)))
                    rt--;
                else
                    lt++;
            }else{
                lt++;
                rt--;
            }
        }

        if (flag)
            return "YES";
        else
            return "NO";
    }
}
