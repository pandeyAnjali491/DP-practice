package assg1;

public class ques10 {
    public static void mergeArr(int arr1[], int arr2[], int i, int j, int k, int res[]) {
        // Base case: if both arrays are end
        if (i == arr1.length && j == arr2.length) return;

        // If arr1 is end take from arr2
        if (i == arr1.length) {
            res[k] = arr2[j];
            mergeArr(arr1, arr2, i, j + 1, k + 1, res);
            return;
        }

        // If arr2 is end take from arr1
        if (j == arr2.length) {
            res[k] = arr1[i];
            mergeArr(arr1, arr2, i + 1, j, k + 1, res);
            return;
        }

        // merging 
        if (arr1[i] <= arr2[j]) {
            res[k] = arr1[i];
            mergeArr(arr1, arr2, i + 1, j, k + 1, res);
        } else {
            res[k] = arr2[j];
            mergeArr(arr1, arr2, i, j + 1, k + 1, res);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6};
        int res[] = new int[arr1.length + arr2.length];

        mergeArr(arr1, arr2, 0, 0, 0, res);

        // Print merged array
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
