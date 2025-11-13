package dp.tabulation;
public class tabulation01knapsap {

    // tabulation top to bottom
    public static int totalPoss(int w,int val[],int wt[]){
        int dp[][] = new int[val.length+1][w+1];
        for(int i=0;i<=val.length;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<=w;j++){
            dp[0][j] = 0;
        }
        
        for(int i=1;i<=val.length;i++){
                for(int j=1;j<=w;j++){
                    if(wt[i-1]<=j){
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-wt[i-1]]+val[i-1]);
                    }
                    else{
                        // not pick
                        dp[i][j] = dp[i-1][j];
                    }
                }
        }
        return dp[val.length][w];
    }
    public static void main(String[] args) {
        int val[] = {1, 2, 3};
        int wt[] = {4, 5, 1};
        int w =4;
        System.out.println(totalPoss(w,val,wt));
    }
}
