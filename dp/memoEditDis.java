package dp;

import java.util.Arrays;

public class memoEditDis {
    public static int match(String s1,String s2,int m,int n,int dp[][]){
        if(m==0 && n!=0) return n;
        if(m!=0 && n==0) return m;
        if(m==0 && n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];

        if(s1.charAt(m-1)!=s2.charAt(n-1)){
            int min = Integer.MAX_VALUE;
            min = Math.min(min,match(s1,s2,m-1,n,dp)+1);
            min = Math.min(min,match(s1,s2,m,n-1,dp)+1);
            min = Math.min(min,match(s1,s2,m-1,n-1,dp)+1);
            dp[m][n] = min;
        }
        else{
            dp[m][n] = match(s1,s2,m-1,n-1,dp);
        }
        return dp[m][n];
    }
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[m+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return match(word1,word2,m,n,dp);
    }
    public static void main(String[] args) {
        String word1="horse";
        String word2 = "ros";
        System.out.println(minDistance(word1,word2));
    }
}
