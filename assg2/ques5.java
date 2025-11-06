package assg2;
public class ques5 {
    public static void main(String[] args) {
        String tiles = "AAB";
        System.out.println(totalSequences(tiles));
    }

    public static int totalSequences(String tiles) {
        int[] freq = new int[26];

        // count each character
        for (char ch:tiles.toCharArray()) {
            freq[ch-'A']++;
        }

        return helper(freq);
    }

    public static int helper(int[] freq) {
        int count = 0;

        // try using each letter
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                count++;              
                freq[i]--;            
                count += helper(freq); 
                freq[i]++;     
            }
        }

        return count;
    }
}
