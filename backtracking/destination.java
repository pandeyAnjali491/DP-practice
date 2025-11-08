package backtracking;
public class destination {

    public static boolean totalWays(int arr[][],int i,int j){
        if(i==arr.length-1 && j==arr.length-1 ){
            return true;
        }
        if(i>=arr.length || j>=arr.length){
            return false;
        }
        if(arr[i][j]==1){
            return false;
        }
        // down
        return totalWays(arr, i+1, j) || totalWays(arr, i, j+1);
    }
    public static void main(String[] args) {
        int arr[][] = {{0,0,0,1},{0,1,0,0},{0,0,1,0},{0,0,0,0}};
        boolean isPoss = totalWays(arr,0,0);
        System.out.println(isPoss);
    }   
}
