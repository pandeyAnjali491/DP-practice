package dp.tabulation;

public class longestCommonSub {
    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        return longSubs(text1,text2,m,n);
    }
    public static int longSubs(String s1,String s2,int m,int n){
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<=n;j++){
            dp[0][n] = 0;
        }
        String res ="";
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] =  1 + dp[i-1][j-1];
                    res += s1.charAt(i-1) +"";
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        System.out.println("longest common subs: "+res);
        return dp[m][n];
    }
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("intention","ace"));
    }
}
