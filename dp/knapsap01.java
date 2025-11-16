package dp;

public class knapsap01 {
    public static int knapsack(int W, int val[], int wt[]) {
        // code here
        int dp[][] = new int[val.length][W+1]; 
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return totalPoss(W,val,wt,0,dp);
        
    }
    public static int totalPoss(int w,int val[],int wt[],int i,int dp[][]){
        if(i==val.length) return 0;
        if(w==0) return 0;
        // choose
        if(dp[i][w]!=-1) return dp[i][w];
        int maxProfit = Integer.MIN_VALUE;
        if(w-wt[i]>=0){
            maxProfit  = Math.max(maxProfit,totalPoss(w-wt[i],val,wt,i+1,dp) + val[i]);
        }
        // not choose
        maxProfit  = Math.max(maxProfit,totalPoss(w,val,wt,i+1,dp));
        dp[i][w] = maxProfit;
        
        return maxProfit;
    }
    public static void main(String[] args) {
        int w = 4;
        int val[] = {1, 2, 3};
        int wt[] = {4, 5, 1};
        System.out.println(knapsack(w, val, wt));
    }
}