
import java.util.Arrays;

public class frogjump {
    public static int findCost(int arr[],int n,int dp[]){
        if(n==0){
            return 0;
        }
        if(n==1){
            return Math.abs(arr[1]-arr[0]);
        }
        
        if(dp[n]!=-1) return dp[n];
        int cost1 = findCost(arr,n-1,dp) + Math.abs(arr[n]-arr[n-1]);   
        int cost2 = findCost(arr,n-2,dp) + Math.abs(arr[n]-arr[n-2]);   
        dp[n] = Math.min(cost1,cost2);
        return dp[n];
    }
    public static void main(String[] args) {
        int height[] = {20,30,40,20};
        int dp[] = new int[height.length]; 
        Arrays.fill(dp,-1);
        System.out.println(findCost(height,height.length-1,dp));
    }
}
