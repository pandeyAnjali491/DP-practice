package dp.tabulation;

public class tabulationSubsetSum {
     static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return isPres(arr,sum);
    }
    static boolean isPres(int arr[],int sum){
        boolean dp[][] = new boolean[arr.length+1][sum+1];
        for(int i=0;i<=arr.length;i++){
            dp[i][0] = true;
        }
        for(int j=1;j<=sum;j++){
            dp[0][j] = false;
        }
        
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=sum;j++){
                boolean pick = false;
                if(arr[i-1]<=j){
                    pick = dp[i-1][j - arr[i-1]]; 
                }
                boolean notpick = dp[i-1][j];
                dp[i][j] = pick||notpick;
            }
        }
        return dp[arr.length][sum];    
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int sum = 12;
        System.out.println(isSubsetSum(arr, sum));
    }
}
