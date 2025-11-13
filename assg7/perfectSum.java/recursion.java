public class recursion {
    // using recursion
    
    public static int perfectSum(int[] nums, int target) {
        // code here
        return isPres(nums,target,nums.length-1);
        
    }
    static int isPres(int arr[],int sum,int n){
        if(n<0){
            return sum==0 ? 1: 0;   
        }
        if(arr[n]==0) return 2*isPres(arr,sum,n-1);
        
        int count =0;
        if(sum-arr[n]>=0){
            count += isPres(arr,sum-arr[n],n-1);
        }
        count += isPres(arr,sum,n-1);
        
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 4, 3};
        int sum = 10;
        System.out.println(perfectSum(arr, sum));

    }
}
