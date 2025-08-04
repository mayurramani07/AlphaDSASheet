package ARRAY2;
import java.util.*;
public class FindValidPairOfAdjacent {
    public static String findValidPair(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0 ; i<s.length() ; i++) {
            char first = s.charAt(i);
            char second =s.charAt(i+1);

            if(first != second) {
                int countFirst = map.get(first);
                int countSecond = map.get(second);

                if(countFirst == Character.getNumericValue(first) && countSecond == Character.getNumericValue(second)) {
                    return "" + first + second;
                }
            }
        }
        return "";
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)