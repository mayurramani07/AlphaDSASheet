package LC4TOP150;
import java.util.*;
public class UniqueLengthPalindromic {
    public static int UniqueLength(String s) {
        int[] firstOcc = new int[26];
        int[] lastOcc = new int[26];

        Arrays.fill(firstOcc, Integer.MAX_VALUE);
        for(int i=0 ; i<s.length() ; i++) {
            firstOcc[s.charAt(i) - 'a'] = Math.min(firstOcc[s.charAt(i) - 'a'], i);
            lastOcc[s.charAt(i) - 'a'] = i;
        }
        int ans = 0;
        for(int i=0 ; i<26; i++) {
            int f = firstOcc[i];
            int l = lastOcc[i];
            Set<Character> set = new HashSet<>();

            if(f < l) {
                for(int j=f+1 ; j<l ; j++) {
                    set.add(s.charAt(j));
                }
            }
            ans += set.size();
        }
        return ans;
    }
}
