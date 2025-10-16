package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class CouponCodeValidator {
    public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActivated) {
        List<String> order = Arrays.asList("electronics", "grocery", "pharmacy", "restaurant");

        List<String> coupons = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String b : order) {
            map.put(b, new ArrayList<>());
        }
        for(int i=0 ; i<code.length ; i++) {
            String c = code[i];
            String b = businessLine[i];
            boolean active = isActivated[i];

            if(c != null && !c.isEmpty() && c.matches("[a-zA-Z0-9_]+")) {
                if(map.containsKey(b) && active) {
                    map.get(b).add(c);
                }
            }
        }

        for(String b : order) {
            List<String> list = map.get(b);
            Collections.sort(list);
            coupons.addAll(list);
        }

        return coupons;
    }
}