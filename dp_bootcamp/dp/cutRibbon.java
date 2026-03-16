import java.util.*;

public class cutRibbon {

    public static int knap(int arr[],int n,int tar,int dp[][]){
        if (tar==0) {
            return 0;
        }
        if (n==0) {
            return -1;
        }
        if (dp[n][tar]!=-101) {
            return dp[n][tar];
        }
        int res1 = -1;
        if(arr[n-1]<=tar){
            res1 = knap(arr, n, tar-arr[n-1],dp);
            if (res1!=-1) {
                res1++;
            }
        }
        int res2 = knap(arr, n-1, tar,dp);
        return dp[n][tar] = Math.max(res1,res2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt(); 
        int arr[] = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        int dp[][] = new int[4][tar+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],-101);
        }
        int res = knap(arr,3,tar,dp);
        System.out.println(res);
    }
}