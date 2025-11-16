package dp.tabulation;

public class editDistance {
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        return match(word1,word2,m,n);
    }
    public static int match(String s1,String s2,int m,int n){
        int dp[][] = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            dp[i][0] = i; 
        }
        for(int j=1;j<=n;j++){
            dp[0][j] = j; 
        }
        dp[0][0] = 0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
               if(s1.charAt(i-1)!=s2.charAt(j-1)){
                    int min = Integer.MAX_VALUE;
                    min = Math.min(min,dp[i-1][j] + 1);
                    min = Math.min(min,dp[i][j-1] + 1);
                    min = Math.min(min,dp[i-1][j-1]+ 1);
                    dp[i][j] = min;
                } 
                else{
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String word1="horse";
        String word2 = "ros";
        System.out.println(minDistance(word1,word2));
    }
}