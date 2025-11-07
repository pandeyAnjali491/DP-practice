package backtracking;

import java.util.ArrayList;
import java.util.List;

public class generateBin2 {
    public static void totalBinStr(int n,int i,String res,List<String> allRes){
        if(i==n){
            allRes.add(res);
            return;
        }
        // add 0;
        totalBinStr(n,i+1, res, allRes);
        // add 1 
        res = res.substring(0,i)+"1"+res.substring(i+1);
        totalBinStr(n,i+1, res, allRes);
    }
    public static void main(String[] args) {
        int n = 3;
        List<String> allRes = new ArrayList<>();
        totalBinStr(n,0,"000",allRes);
        System.out.println(allRes);
    }
}
