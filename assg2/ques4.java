package assg2;

import java.util.ArrayList;
import java.util.List;

public class ques4 {
     public static void totalComb(int n,int i,int k,List<Integer> res){
        // base case
        if(i==n+1) {
            if(res.size()==k){
                System.out.print(res+" ");
            }
            return;
        }
        // yes include
        res.add(i);
        totalComb(n,i+1,k,res);
        // not include
        res.remove(res.size()-1);
        totalComb(n,i+1,k,res);

    }
    public static void main(String[] args) {
        int n =4;
        int k=2;
        totalComb(n,1,k,new ArrayList<>());
    }
}
