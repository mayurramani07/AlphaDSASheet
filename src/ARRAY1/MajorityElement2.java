package ARRAY1;
import java.util.*;
public class MajorityElement2 {
    public static List<Integer> MajorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> majorElement = new ArrayList<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) > n/3) {
                majorElement.add(key);
            }
        }
        return majorElement;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)