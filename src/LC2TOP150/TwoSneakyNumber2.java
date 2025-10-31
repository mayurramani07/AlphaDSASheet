package LC2TOP150;
import java.util.*;
public class TwoSneakyNumber2 {
    public static int[] SneakyNumbers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums) {
            if(seen.contains(num)) {
                list.add(num);
            } else {
                seen.add(num);
            }
        }
        return new int[] {list.get(0), list.get(1)};
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)