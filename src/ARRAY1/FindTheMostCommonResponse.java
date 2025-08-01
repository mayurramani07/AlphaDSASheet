package ARRAY1;
import java.util.*;
public class FindTheMostCommonResponse {
    public static String FindMostCommon(List<List<String>> responses) {
        Map<String, Integer> map = new HashMap<>();

        for (List<String> dayResponses : responses) {
            Set<String> uniqueResponses = new HashSet<>(dayResponses);
            for (String response : uniqueResponses) {
                map.put(response, map.getOrDefault(response, 0) + 1);
            }
        }
        String result = null;
        int maxFreq = 0;

        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            String response = entry.getKey();
            int count = entry.getValue();

            if(count > maxFreq || (count == maxFreq && (result == null || response.compareTo(result) < 0))) {
                result = response;
                maxFreq = count;
            }
        }
        return result;
    }
}

//TIME COMPLEXITY : O(n * m)
//SPACE COMPLEXITY : O(R)