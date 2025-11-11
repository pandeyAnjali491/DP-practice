package assg5;

import java.util.Arrays;
import java.util.Scanner;

public class boredom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int range = 0;
        for (int i = 0; i < arr.length; i++) {
            range = Math.max(range, arr[i]);
        }
        int freq[] = new int[range+1];
        calFreq(arr,freq);
        int dp[] = new int[freq.length];
        Arrays.fill(dp, -1);
        int points = maxPoint(freq,freq.length-1,dp);
        System.out.println("total points are: "+points);
        sc.close();
    }
    public static void calFreq(int arr[],int freq[]){
        for (int ele : arr) {
            freq[ele]++;
        }
    }
    public static int maxPoint(int freq[],int n,int dp[]){
        if(n==0) return freq[0];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int max = Integer.MIN_VALUE;
        // take no
        int point1 = maxPoint(freq, n-2,dp) + (freq[n]*n);
        // skip
        int point2 = maxPoint(freq, n-1,dp);
        max = Math.max(point1, point2);
        dp[n] = max;
        return max;
    }
}