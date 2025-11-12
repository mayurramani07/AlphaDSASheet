package LC3TOP150;
import java.util.*;
public class FindMissingElement {
    public static List<Integer> findMissing(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        for(int i=min ; i<=max ; i++) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
