package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class MinimumCostToMakeTwoBinaryStringEqual {
    public static long MinCostBinarySearch(String s, String t, int flipCost, int swapCost, int crossCost) {
        long cnt01 = 0;
        long cnt10 = 0;
        int n = s.length();

        for(int i=0; i<n; i++) {
            if(s.charAt(i) != t.charAt(i)) {
                if(s.charAt(i) == '0') {
                    cnt01++;
                } else {
                    cnt10++;
                }
            }
        }
        long total = 0;
        long mix = Math.min(cnt01, cnt10);
        long mixedCost = Math.min(swapCost, 2l * flipCost);
        total += mix * mixedCost;
        long remaining = Math.abs(cnt01 - cnt10);
        long same = remaining / 2;
        long sameCost = Math.min((long)swapCost + crossCost, 2l * flipCost);
        total += same * sameCost;
        if(remaining % 2 != 0){
            total += flipCost;
        }
        return total;
    }
}
