package baekjoon.queueanddeck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem4 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++){
            StringTokenizer sb1 = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(sb1.nextToken());
            int seq = Integer.parseInt(sb1.nextToken());

            Deque<Document> deque = new LinkedList<>();
            StringTokenizer sb2 = new StringTokenizer(br.readLine());
            for(int k=0; k<n; k++){
                Document doc = new Document(k, Integer.parseInt(sb2.nextToken()));
                deque.addLast(doc);
            }

            int count = 1;
            while(true){
                Document maxDoc = deque.stream()
                        .max(Comparator.comparingInt(Document::getImp))
                        .orElseThrow(NoSuchElementException::new);

                Document doc = deque.peek();

                if(maxDoc.imp == doc.imp){
                    if(doc.seq == seq){
                        sb.append(count).append('\n');
                        break;
                    }else{
                        deque.pollFirst();
                        count++;
                    }
                }else{
                    deque.addLast(deque.pollFirst());
                }
            }

            deque.clear();
        }

        System.out.println(sb);
    }
}

class Document{
    public int seq;
    public int imp;

    public Document(int seq, int imp){
        this.seq = seq; this.imp = imp;
    }

    public int getImp(){
        return this.imp;
    }

}



