package dp;

public class uniquePath1 {
    public static int uniquePaths(int m, int n) {
        // dp problem
        int dp[][] = new int[m+1][n+1];  
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return totalWays(0,0,m,n,dp);
    }
    public static int totalWays(int i,int j,int m,int n,int dp[][]){
        if(i==m-1 && j==n-1) return 1;
        if(i>=m || j>=n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j] = totalWays(i+1,j,m,n,dp) + totalWays(i,j+1,m,n,dp);
        return dp[i][j];
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
}
