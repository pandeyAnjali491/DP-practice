package assg1;

public class ques2 {
    public static int maxEle(int arr[], int i, int max) {
        // base case - reached to last ele in arr
        if (i == arr.length)
            return max;
        // logic - if current ele is greater than max then max = ele
        return maxEle(arr, i + 1, Math.max(max, arr[i]));
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 3, 4 };
        int max = maxEle(arr, 0, Integer.MIN_VALUE);
        if (max == Integer.MIN_VALUE)
            System.out.println("arr is empty");
        else
            System.out.println("max ele: " + max);
    }
}
