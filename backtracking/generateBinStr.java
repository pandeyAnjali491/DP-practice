package backtracking;
import java.util.*;

public class generateBinStr {
    public static void totalBinStr(int n,String res,List<String> allRes){
        if(n==0){
            allRes.add(res);
            return;
        }
        // add 1;
        totalBinStr(n-1, res+"1", allRes);
        // add 0 
        totalBinStr(n-1, res+"0", allRes);
    }
    public static void main(String[] args) {
        int n = 3;
        List<String> allRes = new ArrayList<>();
        totalBinStr(n,"",allRes);
        System.out.println(allRes);
    }
}
