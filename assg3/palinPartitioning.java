package assg3;

import java.util.ArrayList;
import java.util.List;

public class palinPartitioning {
    public static void allSubs(String s,List<String>res,List<List<String>>allRes){
        // base case
        if(s.length()==0){
            if(isPalim(res)){
                allRes.add(new ArrayList<>(res));
            }
            System.out.println(res);
            return;
        }
        for(int i=0;i<s.length();i++){
            String rem = s.substring(i+1);
            res.add(s.substring(0,i+1));
            allSubs(rem,res,allRes);
            res.remove(res.size()-1);
        }
    }
    public static boolean isPalim(List<String> str){
        for(String s:str){
            int i=0;
            int j=s.length()-1;
            while(i<=j){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
    public static List<List<String>> partition(String s) {
        List<List<String>>  res = new ArrayList<>();
        allSubs(s,new ArrayList<>(),res);
        return res;
    }
    public static void main(String[] args) {
        String s = "aab";
        System.out.println("res- "+partition(s));
    }
}
