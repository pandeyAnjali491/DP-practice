package assg7.tabulationQues;

public class frogJump {

    static int findCost(int arr[],int n){
        int dp[] = new int[arr.length];
        dp[0] = 0;
        if(n>1){
            dp[1] = Math.abs(arr[1]-arr[0]);
            for(int i=2;i<n;i++){
                int cost1 = dp[i-1] + Math.abs(arr[i]-arr[i-1]);  
                int cost2 = dp[i-2] + Math.abs(arr[i]-arr[i-2]);  
                dp[i] = Math.min(cost1,cost2);
            }
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int arr[] = {30, 20, 50, 10, 40};
        System.out.println(findCost(arr, arr.length));
    }
}
