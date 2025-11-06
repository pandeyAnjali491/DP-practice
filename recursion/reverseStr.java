package recursion;
public class reverseStr {
    public static String reverse(String org,String res,int i){
        if(i<0) {
            return res;
        }
        return reverse(org,res+org.charAt(i),i-1); 
    }
    public static void main(String[] args) {
        String org = "abcd";
        String res = reverse(org, "",org.length()-1);
        System.out.println(res);
    }
}
