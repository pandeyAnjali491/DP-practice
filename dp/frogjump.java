import java.util.*;

public class frogjump {
    // public static int findCost(int arr[],int n,int dp[]){
    //     if(n==0){
    //         return 0;
    //     }
    //     if(n==1){
    //         return Math.abs(arr[1]-arr[0]);
    //     }
        
    //     if(dp[n]!=-1) return dp[n];
    //     int cost1 = findCost(arr,n-1,dp) + Math.abs(arr[n]-arr[n-1]);   
    //     int cost2 = findCost(arr,n-2,dp) + Math.abs(arr[n]-arr[n-2]);   
    //     dp[n] = Math.min(cost1,cost2);
    //     return dp[n];
    // }

    public static int jump(int arr[],int n,int dp[]){
        if(n==1) return 0;
        if(n==2) return Math.abs(arr[1]-arr[0]);
        if(dp[n]!=-1) return dp[n];
        int cost1 = jump(arr, n-1,dp) + Math.abs(arr[n-1]-arr[n-2]);
        int cost2 = jump(arr, n-2,dp) + Math.abs(arr[n-1]-arr[n-3]);
        return dp[n] = Math.min(cost1, cost2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n]; 
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int dp[] = new int[n+1]; 
        Arrays.fill(dp,-1);
        System.out.println(jump(height,n,dp));
    }
}
