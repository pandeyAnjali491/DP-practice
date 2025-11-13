package assg7.tabulationQues;

public class uniquePath {

    public static int totalWays(int m,int n){
        int dp[][] = new int[m+1][n+1];
        dp[m-1][n-1] = 1;  
        for(int r=0;r<=m;r++){
            dp[r][n] = 0;
        }
        for(int c=0;c<=n;c++){
            dp[m][c] = 0;
        }
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1&&j==n-1) continue;
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        System.out.println(totalWays(3,7));
    }
}