package Section7;

import java.util.LinkedList;
import java.util.Queue;

public class Problem7 {

    Node root;
    public void solution() {
        Problem7 tree = new Problem7();
        tree.root = new Node(1);
        tree.root.lt = new Section7.Node(2);
        tree.root.rt = new Section7.Node(3);
        tree.root.lt.lt = new Section7.Node(4);
        tree.root.lt.rt = new Section7.Node(5);
        tree.root.rt.lt = new Section7.Node(6);
        tree.root.rt.rt = new Section7.Node(7);

        BFS(tree.root);
    }


    public void BFS(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int l = 0;
        while(!q.isEmpty()){
            int len = q.size();

            for (int i=0; i<len; i++){
                Node cur = q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null){
                    q.offer(cur.lt);
                }
                if(cur.rt != null){
                    q.offer(cur.rt);
                }
            }
            l++;
            System.out.println();
        }
    }

}


