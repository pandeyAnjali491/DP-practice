package assg1;

public class ques9 {
    // reverse arr using recursion
    public static void reverse(int arr[],int s,int e){
        // base case
        if(s>=e) return ;
        // swap logic
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverse(arr, s+1, e-1);
    }
    // display the array
    public static void display(int arr[]){
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.print("before reversing: ");
        display(arr);
        reverse(arr, 0, arr.length-1);
        System.out.print("after reversing: ");
        display(arr);
    }
}
