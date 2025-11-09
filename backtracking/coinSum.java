package backtracking;

public class coinSum {
    static int min = Integer.MAX_VALUE;

    public static int coinChange(int[] coins, int amount) {
        min = Integer.MAX_VALUE;  
        findSol(coins, 0, 0, 0, amount);
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
    public static void findSol(int arr[], int i, int sum, int count, int target) {
        if (sum > target) return; 
        if (sum == target) {
            min = Math.min(min, count);
            return;
        }
        if (i == arr.length) return;
        findSol(arr, i, sum + arr[i], count + 1, target);
        findSol(arr, i + 1, sum, count, target);
    }
    public static void main(String[] args) {
        int coins[] = { 2, 3, 5 };
        int k = 8;
        int count = coinChange(coins,k);
        System.out.println("count is: " + count);
        System.out.println("mini no req are: " + min);
    }
}
