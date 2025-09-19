package TWOPOINTERS1;
import java.util.*;
public class NumberOfMatchingSubsequence {
    public static int numOfMatching(String s, String[] words) {
        int count = 0;
        for(String word : words)  {
            if(isSubsequence(word,s)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isSubsequence(String small, String big) {
        int i = 0;
        int j = 0;

        while(i < small.length() && j < big.length()) {
            if(small.charAt(i) == big.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == small.length();
    }
}

//TIME COMPLEXITY - O(m * n)
//SPACE COMPLEXITY - O(1)
