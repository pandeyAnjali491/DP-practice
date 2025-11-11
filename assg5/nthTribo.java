package assg5;

import java.util.Arrays;

public class nthTribo {
    public static int tribo(int n,int dp[]){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        dp[n] = tribo(n-1,dp)+tribo(n-2,dp)+tribo(n-3,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(tribo(n,dp));
    }
}
