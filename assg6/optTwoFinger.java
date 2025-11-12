package assg6;
import java.util.*;

public class optTwoFinger {
    static HashMap<Character, int[]> coor = new HashMap<>();
    static {
        coor.put('A', new int[]{0, 0});
        coor.put('B', new int[]{0, 1});
        coor.put('C', new int[]{0, 2});
        coor.put('D', new int[]{0, 3});
        coor.put('E', new int[]{0, 4});
        coor.put('F', new int[]{0, 5});
        coor.put('G', new int[]{1, 0});
        coor.put('H', new int[]{1, 1});
        coor.put('I', new int[]{1, 2});
        coor.put('J', new int[]{1, 3});
        coor.put('K', new int[]{1, 4});
        coor.put('L', new int[]{1, 5});
        coor.put('M', new int[]{2, 0});
        coor.put('N', new int[]{2, 1});
        coor.put('O', new int[]{2, 2});
        coor.put('P', new int[]{2, 3});
        coor.put('Q', new int[]{2, 4});
        coor.put('R', new int[]{2, 5});
        coor.put('S', new int[]{3, 0});
        coor.put('T', new int[]{3, 1});
        coor.put('U', new int[]{3, 2});
        coor.put('V', new int[]{3, 3});
        coor.put('W', new int[]{3, 4});
        coor.put('X', new int[]{3, 5});
        coor.put('Y', new int[]{4, 0});
        coor.put('Z', new int[]{4, 1});
    }

    public static int minimumDistance(String word) {
        Integer[][][] dp;
        dp = new Integer[word.length()][27][27]; // 27 = 26 letters + 1 for “none”
        return totalDis(word, 0, 26, 26,dp);
    }

    public static int totalDis(String word, int i, int f1, int f2,Integer dp[][][]) {
        if (i == word.length()) return 0;
        if (dp[i][f1][f2] != null) return dp[i][f1][f2];

        int next = word.charAt(i) - 'A';
        int[] coorArr = coor.get((char)('A' + next));

        int move1 = (f1 == 26) ? 0 :
            Math.abs(coor.get((char)('A' + f1))[0] - coorArr[0]) +
            Math.abs(coor.get((char)('A' + f1))[1] - coorArr[1]);

        int move2 = (f2 == 26) ? 0 :
            Math.abs(coor.get((char)('A' + f2))[0] - coorArr[0]) +
            Math.abs(coor.get((char)('A' + f2))[1] - coorArr[1]);

        int res1 = totalDis(word, i + 1, next, f2,dp) + move1;
        int res2 = totalDis(word, i + 1, f1, next,dp) + move2;

        return dp[i][f1][f2] = Math.min(res1, res2);
    }
    public static void main(String[] args) {
        System.out.println(minimumDistance("HAPPY"));
    }

}
