package backtracking;

public class validSudoku {
    public static boolean isValidSudoku(char[][] board) {
        return checkSudoku(board);
    }

    public static boolean checkSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (!isValid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid(char arr[][], int r, int c) {
        char val = arr[r][c];
        // same row
        for (int i = 0; i < 9; i++) {
            if (arr[i][c] == val && i != r)
                return false;
        }
        // same col
        for (int j = 0; j < 9; j++) {
            if (arr[r][j] == val && j != c)
                return false;
        }
        // same grid
        // int sr = 0;
        // if (r >= 3 && r < 6) {
        //     sr = 3;
        // } else if (r >= 6) {
        //     sr = 6;
        // }

        // or

        int sr = (r)/3 * 3;

        // int sc = 0;
        // if (c >= 3 && c < 6) {
        //     sc = 3;
        // } else if (c >= 6) {
        //     sc = 6;
        // }
        // or
        int sc = (c)/3 * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (arr[i][j] == val && i != r && j != c)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char arr[][] = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        System.out.println(isValidSudoku(arr));
    }
}
