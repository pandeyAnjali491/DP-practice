import java.util.Arrays;

public class dp {
    // perfect sum by dp
    public static int perfectSum(int[] nums, int target) {
        // code here
        int dp[][] = new int[nums.length][target+1];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        return isPres(nums,target,nums.length-1,dp);
        
    }
    static int isPres(int arr[],int sum,int n,int dp[][]){
        if(n<0){
            return sum==0 ? 1: 0;   
        }
        if(arr[n]==0) return 2*isPres(arr,sum,n-1,dp);
        
        if(dp[n][sum] != -1) return dp[n][sum];
        
        int count =0;
        if(sum-arr[n]>=0){
            count += isPres(arr,sum-arr[n],n-1,dp);
        }
        count += isPres(arr,sum,n-1,dp);
        dp[n][sum] = count;
        
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 4, 3};
        int sum = 10 ;
        System.out.println(perfectSum(arr, sum));
    }
}
