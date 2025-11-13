public class tabulation {
    public int perfectSum(int[] nums, int target) {
        // code here
        return isPres(nums,target);
        
    }
    static int isPres(int arr[],int sum){
        int n = arr.length;
        int dp[][] = new int[n+1][sum+1];
        
        // initialization
        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }
        for(int j=1;j<=sum;j++){
            dp[0][j] = 0;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                int count=0;
                if(arr[i-1]==0){
                    count += 2*dp[i-1][j];
                }
                else{
                    if(j - arr[i-1]>=0){
                        count += dp[i-1][j-arr[i-1]];
                    }
                    count += dp[i-1][j];
                }
                dp[i][j] = count;
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1};
        int sum = 1;
        System.out.println(isPres(arr,sum));
    }
}
