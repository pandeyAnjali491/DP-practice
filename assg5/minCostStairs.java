package assg5;

import java.util.Arrays;

public class minCostStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,cost.length-1,dp),minCost(cost,cost.length-2,dp));
    }
    public static int minCost(int arr[],int n,int dp[]){
        if(n==0) return arr[0];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int min = Integer.MAX_VALUE;
        // move 1 step
        int step1 = minCost(arr,n-1,dp) + arr[n];
        // move 2 step
        int step2 = minCost(arr,n-2,dp) + arr[n];
        min = Math.min(step1,step2);
        dp[n] = min;
        return min;
    }
    public static void main(String[] args) {
        int arr[] ={1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(arr));
    }
}
