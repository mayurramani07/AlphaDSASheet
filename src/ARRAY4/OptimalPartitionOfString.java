package ARRAY4;
import java.util.*;
public class OptimalPartitionOfString {
    public static int OptimalPartition(String s) {
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
//Space Complexity : O(1)