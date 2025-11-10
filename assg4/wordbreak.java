import java.util.*;

public class wordbreak {

    public static boolean canBreak(String s, List<String> wordDict) {
        if (s.length() == 0) return true; 

        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (wordDict.contains(prefix)) {
                String suffix = s.substring(i);
                if (canBreak(suffix, wordDict)) return true;
            }
        }

        return false;  
    }
    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> dict = new ArrayList<>();
        dict.add("apple");
        dict.add("pen" );
        System.out.println(canBreak(s,dict));
    }
    
}