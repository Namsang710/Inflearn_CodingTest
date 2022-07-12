package Section2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String [] arr = new String[s.nextInt()];

        for (int i=0; i<arr.length; i++)
            arr[i] = s.next();

        for (String str : arr) {
            String answer = "";
            boolean isPrime = true;

            for (int i=str.length()-1; i>=0; i--) {
                if (str.charAt(i) != '0')
                    answer += str.charAt(i);
            }

            if(Integer.parseInt())

            for(int i=2; i<Integer.parseInt(answer); i++){
                if(Integer.parseInt(answer) % i == 0 ){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
                System.out.print(answer + " ");

        }


    }

}

