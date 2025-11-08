package backtracking;

import java.util.ArrayList;

public class ratInMaze {
    public static void totalWays(int arr[][], int i, int j, String way, ArrayList<String> allWays) {
        if(i==arr.length-1 && j==arr.length-1 ){
            allWays.add(way);
            return;
        }
        if(i>=arr.length || j>=arr.length || i<0 || j<0 || arr[i][j]==0){
            return;
        }
        // down
        arr[i][j] = 0;
        totalWays(arr, i+1, j,way+'D',allWays);
        // right
        totalWays(arr, i, j+1,way+'R',allWays);
        // up
        totalWays(arr,i-1,j,way+'U',allWays);
        // left
        totalWays(arr,i,j-1,way+'L',allWays);
        arr[i][j] = 1;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        ArrayList<String> allways = new ArrayList<>();
        totalWays(arr, 0, 0, "", allways);
        System.out.println(allways);
    }
}
