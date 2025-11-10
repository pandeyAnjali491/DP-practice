package dp;

import java.util.*;

public class climbingStairs {
    public static int rec(int n,int dp[]){
        if(n==0 || n==1) return 1;
        if(n==2) return 2;
        display(dp);
        if(dp[n]!=-1) return dp[n];
        dp[n] = rec(n-1,dp) + rec(n-2,dp);
        return dp[n];
    }
    public static void display(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int res = rec(n,dp);
        display(dp);
        System.out.println("res is: "+res);
    }
}
