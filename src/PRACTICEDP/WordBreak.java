package PRACTICEDP;
import java.util.*;
public class WordBreak {
    public static boolean WordsBreak(String s, List<String> wordDict) {
        HashSet<String> wordSet = new HashSet<>(wordDict);
        Boolean[] dp = new Boolean[s.length()];

        return dfs(s, wordSet, 0,dp);
    }
    public static boolean dfs(String s, HashSet<String> wordSet, int i, Boolean[] dp) {
        if(i == s.length()) {
            return true;
        }
        if(dp[i] != null) {
            return dp[i];
        }
        for(int j=i; j<s.length(); j++) {
            if(wordSet.contains(s.substring(i, j+1))) {
                if(dfs(s, wordSet, j+1, dp)) {
                    return dp[i] = true;
                }
            }
        }
        return dp[i] = false;
    }
}
