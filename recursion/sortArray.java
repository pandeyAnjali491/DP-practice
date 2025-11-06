package recursion;

public class sortArray {
    public static void sorting(int arr[],int i){
        if(i==0) return;
        sorting(arr, i-1);
        inserting(arr, i);
    }
    public static void inserting(int arr[],int i){
        if (i > 0 && arr[i - 1] > arr[i]) {
            // swap if needed
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;

            // keep moving left recursively
            inserting(arr, i - 1);
        }
    }
    public static void main(String[] args) {
        int arr[] ={5,4,3,2,1};
        sorting(arr, arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}