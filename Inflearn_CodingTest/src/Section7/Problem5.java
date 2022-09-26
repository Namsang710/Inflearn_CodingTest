package Section7;

public class Problem5 {
    Node root;
    public static void main(String[] args) {
        Problem5 tree = new Problem5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        DFS(tree.root);
    }

    public static void DFS(Node root){
        if(root == null) return;
        else{

            /*
            System.out.print(root.data); 전위 순회
            DFS(root.lt);
            DFS(root.rt);
            */

            /*
            DFS(root.lt); 중위 순회
            System.out.print(root.data);
            DFS(root.rt);
            */

            /*
            DFS(root.lt); 후위 순회
            DFS(root.rt);
            System.out.print(root.data);
            */

        }

    }
}
class Node{
    int data;
    Node lt, rt;

    public Node(int val){
        data = val;
        lt = rt  =  null;
    }

}