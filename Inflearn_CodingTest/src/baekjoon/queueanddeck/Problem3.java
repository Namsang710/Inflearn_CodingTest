package baekjoon.queueanddeck;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Problem3 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> buffer = new LinkedList<>();

        while(true){
            int packet = Integer.parseInt(br.readLine());

            if (packet == -1)
                break;

            if(packet > 0 && buffer.size() < n){
                buffer.addLast(packet);
            }else if (packet == 0){
                buffer.pollFirst();
            }
        }

        if(buffer.isEmpty())
            System.out.println("empty");
        else{
            for(int packet : buffer)
                System.out.print(packet + " ");
        }
    }
}
