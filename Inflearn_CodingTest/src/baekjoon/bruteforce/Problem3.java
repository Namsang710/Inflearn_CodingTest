package baekjoon.bruteforce;

import java.util.Scanner;

public class Problem3 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Person people[] = new Person[N];

        for(int i=0; i<N; i++){
            people[i] = new Person(sc.nextInt(), sc.nextInt());
        }

        for(int i=0; i<N; i++){
            int score = 1;

            for(int j=0; j<N; j++){
                if(j != i){
                    if (people[i].height < people[j].height &&
                        people[i].weight < people[j].weight){
                        score++;
                    }
                }
            }
            people[i].score = score;
        }


        for(int i=0; i<N; i++)
            System.out.print(people[i].score + " ");

    }
}
class Person{
    public int height;
    public int weight;

    public int score;
    public Person(int weight, int height){
        this.height = height;
        this.weight = weight;
    }

}