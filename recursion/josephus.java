package recursion;

import java.util.ArrayList;

public class josephus {
    public static int winner(ArrayList<Integer> li,int s,int k){
        if(li.size()==1) return li.get(0);
        int ind = (s + k - 1) % li.size();
        li.remove(ind);
        return winner(li,ind,k); 
    }
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(i);
        }
        return winner(li,0,k);
    }
    public static void main(String[] args) {
        int n=6;
        int k=5;
        System.out.println(findTheWinner(n,k));
    }
}
