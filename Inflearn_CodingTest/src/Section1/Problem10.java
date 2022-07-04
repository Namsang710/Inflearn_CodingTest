package Section1;

import java.util.Locale;
import java.util.Scanner;

public class Problem10 {

    public int[] solution() {
        Scanner s = new Scanner(System.in);

        String str = s.next().toLowerCase(Locale.ROOT);
        char target = s.next().charAt(0);

        int answer[] = new int[str.length()];
        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == target)
                p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }
}
