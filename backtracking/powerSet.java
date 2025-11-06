package backtracking;

public class powerSet {
    public static void printSet(String org,int i,String res){
        if(i==org.length()) {
            System.out.println(res);
            return;
        }
        // if yes
        printSet(org, i+1, res+org.charAt(i));
        // no 
        printSet(org, i+1, res);
    }
    public static void main(String[] args) {
        String s = "122";
        printSet(s, 0, "");
    }
}
