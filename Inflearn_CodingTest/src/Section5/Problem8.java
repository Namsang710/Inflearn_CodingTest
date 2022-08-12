package Section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Person{
    int id;
    int priority;

    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}


public class Problem8 {
    public int solution() {
        Scanner s = new Scanner(System.in);


        int n = s.nextInt();
        int k = s.nextInt();

        int arr[] = new int[n];

        int answer = 0;
        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        Queue<Person> queue = new LinkedList<>();

        for(int i=0; i<n; i++){
            queue.offer(new Person(i, arr[i]));
        }

        while(!queue.isEmpty()){
            Person tmp = queue.poll();
            for(Person p : queue){
                if(p.priority > tmp.priority){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                answer++;
                if(tmp.id == k) return answer;
            }

        }
        return answer;
    }
}
