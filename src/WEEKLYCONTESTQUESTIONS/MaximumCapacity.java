package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class MaximumCapacity {
    public static int MaxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        int[][] machines = new int[n][2];

        for(int i=0; i<n ; i++) {
            machines[i][0] = costs[i];
            machines[i][1] = capacity[i];
        }
        Arrays.sort(machines, (a,b) -> a[0] - b[0]);
        int maxCap = 0;

        for(int i=0; i<n ; i++) {
            if(machines[i][0] < budget) {
                maxCap = Math.max(maxCap, machines[i][1]);
            }
        }
        int left = 0, right = n - 1;

        while(left < right) {
            int totalCost = machines[left][0] + machines[right][0];

            if(totalCost < budget) {
                int totalCap = machines[left][1] + machines[right][1];
                maxCap = Math.max(maxCap, totalCap);
                left++;
            } else {
                right--;
            }
        }
        return maxCap;
    }
}