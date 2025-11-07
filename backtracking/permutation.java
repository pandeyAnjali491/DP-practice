package backtracking;

public class permutation {
    public static void permut(String s,String res){
        if(s.length()==0) {
            System.out.println(res);
            return;
        }
        for(int j=0;j<s.length();j++){
            String rem = s.substring(0, j)+s.substring(j+1);
            permut(rem, res+s.charAt(j));
        }
    }
    public static void main(String[] args) {
        String s ="ABC";
        permut(s, "");
    }
}
