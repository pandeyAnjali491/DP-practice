package dp;

import java.util.Arrays;

public class longestCommonSub {
    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int dp[][] = new int[m+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return longSubs(text1,text2,m,n,dp);
    }
    public static int longSubs(String s1,String s2,int m,int n,int dp[][]){
        if(m==0|| n==0) return 0;
        if(dp[m][n] != -1) return dp[m][n];
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            dp[m][n] =  1 + longSubs(s1,s2,m-1,n-1,dp);
        }
        else{
            dp[m][n] = Math.max(longSubs(s1,s2,m,n-1,dp),longSubs(s1,s2,m-1,n,dp));
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("ABCDGH", "ACDGHR"));
    }
}
