package assg2;
public class ques1 {
    public static void totalNo(int n,int i,String res){
        if(i==n) {
            if(prefixValid(res,res.length())){
                System.out.println(res);
            }
            return;
        }
        // if 1 is the choice
        totalNo(n, i+1, res+"1");
        // else 0 is the choice
        totalNo(n, i+1, res+"0");
    }
    // to check only for all prefixes
    public static boolean prefixValid(String res,int n){
        if(n==0) return true;
        if(!isValid(res)){
            return false;
        }
        return prefixValid(res.substring(0,n), n-1);
    }
    // to check the count of 1 
    public static boolean isValid(String res){
        int count0=0;
        int count1=0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='0') count0++;
            else if(res.charAt(i)=='1') count1++;
        }
        if(count1>=count0 && res.charAt(0)=='1') return true;
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        totalNo(n, 0, "");
    }
}
