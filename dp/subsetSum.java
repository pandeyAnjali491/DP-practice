package dp;

public class subsetSum {
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        Boolean dp[][] = new Boolean[arr.length][sum+1];
        return isPres(arr,sum,0,dp);
    }
    static boolean isPres(int arr[],int sum,int i,Boolean dp[][]){
        if(sum<0) return false;
        if(sum==0) return true; 
        if(i==arr.length) return false;
        if(dp[i][sum]!=null) return dp[i][sum];
        
        dp[i][sum] = isPres(arr,sum-arr[i],i+1,dp) || isPres(arr,sum,i+1,dp);
        return dp[i][sum];
    }
    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSubsetSum(arr, sum));
    }
}
