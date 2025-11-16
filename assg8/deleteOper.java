package assg8;

public class deleteOper {
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        return m+n-2*longSubs(word1,word2,m,n);
    }
    public static int longSubs(String s1,String s2,int m,int n){
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<=n;j++){
            dp[0][n] = 0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] =  1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        System.out.println(minDistance("sea", "eat"));
    }
}
