package assg6;
public class uniquePath2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m+1][n+1];  
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return totalWays(obstacleGrid,0,0,m,n,dp);
    }
    public static int totalWays(int arr[][],int i,int j,int m,int n,int dp[][]){
        if(i==m-1 && j==n-1 && arr[i][j]==0) return 1;
        if(i>=m || j>=n) return 0;
        if(arr[i][j]==1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j] = totalWays(arr,i+1,j,m,n,dp) + totalWays(arr,i,j+1,m,n,dp);
        return dp[i][j];
    }
    public static void main(String[] args) {
        int grid[][] = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(grid));
    }
}
