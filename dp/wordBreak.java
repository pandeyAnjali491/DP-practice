import java.util.ArrayList;
import java.util.List;

public class wordBreak {
    public static boolean canBreak(String s, int i, List<String> wordDict, Boolean dp[]) {
        if (i == s.length()) return true; 

        if (dp[i] != null) return dp[i];  

        for (int j = i + 1; j <= s.length(); j++) {
            String substr = s.substring(i, j);
            if (wordDict.contains(substr) && canBreak(s, j, wordDict, dp)) {
                dp[i] = true;
                return true;
            }
        }

        dp[i] = false;  
        return false;
    }
    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");

        Boolean dp[] = new Boolean[s.length() + 1]; 
        boolean res = canBreak(s, 0, wordDict, dp);
        System.out.println(res);
    }
}
