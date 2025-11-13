package dp;

import java.util.ArrayList;
import java.util.List;

public class wordBreak2 {
    public static void canBreak(String s, int i, List<String> wordDict, String res, List<String> allres) {
        if (i == s.length()) {                  
            allres.add(res.trim());             
            return;                             
        }

        for (int j = i + 1; j <= s.length(); j++) {
            String substr = s.substring(i, j);
            if (wordDict.contains(substr)) {
                canBreak(s, j, wordDict, res + substr + " ", allres);
            }
        }
    }
    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");

        List<String> res = new ArrayList<>();
        canBreak(s, 0, wordDict, "", res);
        System.out.println(res);
    }
}
