package ARRAY12;
import java.util.*;
public class OptimalPartitionOdfString {
    public static int PartitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 1;


        for(char ch : s.toCharArray()) {
            if(set.contains(ch)) {
                count++;
                set.clear();
            }
            set.add(ch);
        }
        return count;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)