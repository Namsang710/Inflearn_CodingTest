package Section6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem7 {
    public List<Point> solution() {

        Scanner s = new Scanner(System.in);
        List<Point> arr = new ArrayList<>();

        int n = s.nextInt();

        for(int i=0; i<n; i++){
            arr.add(new Point(s.nextInt(), s.nextInt()));
        }

        for(int i=0; i<n-1; i++){
            int index = i;
            Point p1 = arr.get(i);

            for(int j=i+1; j<n; j++){
                Point p2 = arr.get(j);

                if(p1.getX() > p2.getX()){
                    index = j;
                    p1 = p2;
                }
                else if(p1.getX() == p2.getX()){
                    if(p1.getY() > p2.getY()){
                        index = j;
                        p1 = p2;
                    }
                }
            }

            Point tmp = arr.get(index);
            arr.set(index, arr.get(i));
            arr.set(i, tmp);
        }

        return arr;

    }
}

class Point{
    private int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

}
