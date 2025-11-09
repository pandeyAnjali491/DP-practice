package backtracking;

public class nQueens {
    static int count = 0;

    public static int countSolutions(int n) {
        count = 0;
        char arr[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '.';
            }
        }
        totalWays(arr, 0);
        return count;
    }

    public static void totalWays(char arr[][], int i) {
        if (i == arr.length) {
            for (int j = 0; j < arr.length; j++) {
                for (int j2 = 0; j2 < arr.length; j2++) {
                    System.out.print(arr[j][j2]+" ");
                }
                System.out.println();
            }
            System.out.println();
            count++;
            return;
        }

        for (int j = 0; j < arr.length; j++) {
            if (isValid(arr, i, j)) {
                arr[i][j] = 'Q';
                totalWays(arr, i + 1);
                arr[i][j] = '.';
            }
        }
    }

    public static boolean isValid(char arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            if (arr[i][c] == 'Q')
                return false;
        }
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q')
                return false;
        }
        for (int i = r - 1, j = c + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int res = countSolutions(4);
        System.out.println(res);
    }
}
