package dp;

import java.util.*;

public class ncr {

    public static int nCr(int n, int r) {
        // boundary cond
        if(r>n) return 0;
        
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int ndivrfact = fact(n,r+1,dp);
        // int rfact = fact(r,1,dp);
        int nrfact = fact(n-r,1,dp);
        System.out.println("n/r!"+ndivrfact);
        // System.out.println("r!"+rfact);
        System.out.println("n-r!"+nrfact);
        int ncr = ndivrfact/nrfact;
        return ncr;
    }
    public static int fact(int n,int stop,int dp[]){
        if(n==stop) return stop;
        if(dp[n]!=-1) return dp[n];
        dp[n] = n*fact(n-1,stop,dp);
        return dp[n];
    }
    // public static int fact(int n){
    //     if(n==0) return 1;
    //     return  n*fact(n-1);
    // }
    public static void main(String[] args) {
        System.out.println(nCr(25, 10));
        // System.out.println(fact(16));
    }
}