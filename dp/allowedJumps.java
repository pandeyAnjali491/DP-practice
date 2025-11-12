import java.util.Arrays;

// if k jumps are allowed - only one parameter is changing so one dimension array

public class allowedJumps {
    public static int minCost(int arr[],int n,int k,int dp[]){
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1) return dp[n];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if(n-i>=0){
                min = Math.min(min,minCost(arr, n-i, k,dp) + Math.abs(arr[n-i]-arr[n]));
            }
        }
        display(dp);
        dp[n] = min;
        return dp[n];
    }
    public static void display(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int height[] = {10,20,30,10,40};
        int k = 2;
        int dp[] = new int[height.length];
        Arrays.fill(dp, -1);
        System.out.println("min cost is: "+minCost(height,height.length-1,k,dp));
    }
}
