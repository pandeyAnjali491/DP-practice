package dp;

public class editDistance {
    public static int match(String s1,String s2,int m,int n){
        if(m==0 && n!=0) return n;
        if(m!=0 && n==0) return m;
        if(m==0 && n==0) return 0;

        if(s1.charAt(m-1)!=s2.charAt(n-1)){
            int min = Integer.MAX_VALUE;
            min = Math.min(min,match(s1,s2,m-1,n)+1);
            min = Math.min(min,match(s1,s2,m,n-1)+1);
            min = Math.min(min,match(s1,s2,m-1,n-1)+1);
            return min;
        }
        else{
            return match(s1,s2,m-1,n-1);
        }
    }
    public static void main(String[] args) {
        String word1="horse";
        String word2 = "ros";
        System.out.println(match(word1,word2,word1.length(),word2.length()));
    }
}
