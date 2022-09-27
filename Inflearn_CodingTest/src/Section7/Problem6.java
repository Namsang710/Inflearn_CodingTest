package Section7;

public class Problem6 {
    static int n;
    static int[] ch;

    public void DFS(int L){
        if (L == n + 1){
            String str = "";
            for(int i=0 ; i<=n; i++){
                if (ch[i] == 1)
                    str += (i+" ");
            }
            if (str.length() > 0)
                System.out.println(str);
        }else{
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }
    public void solution() {
        Problem6 T = new Problem6();
        n=3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
