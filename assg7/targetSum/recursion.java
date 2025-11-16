public class recursion {
    public static int findSum(int arr[],int n,int k,int sum){
        if(n<0){
            if(sum==k) return 1;
            else return 0;
        } 
        return findSum(arr,n-1,k,sum+arr[n]) + findSum(arr,n-1,k,sum-arr[n]);
    }
   public static void main (String args[]) {
        int nums[] = {1,1,1,1,1};
        int target = 3; 
        System.out.println(findSum(nums,nums.length-1,target,0));
   }
}