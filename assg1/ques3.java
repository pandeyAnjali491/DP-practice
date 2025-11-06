package assg1;

public class ques3 {
    public static boolean isSorted(int arr[],int i){
        // base case - reached to the end of array return true (sorted)
        if(i==arr.length) return true;
        // logic - check the previous index ele if it is not smaller than current one return false
        if( i!=0 && arr[i]<arr[i-1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("is sorted: "+isSorted(arr, 0));
    }   
}
