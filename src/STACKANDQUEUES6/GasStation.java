package STACKANDQUEUES6;
import java.util.*;
public class GasStation {
    public static int GasStations(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;

        for(int i=0 ; i<gas.length ; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) {
            return -1;
        }
        int currentGas = 0;
        int startIndex = 0;

        for(int i=0 ; i<gas.length ; i++) {
            currentGas += gas[i] - cost[i];

            if(currentGas < 0) {
                startIndex = i+1;
                currentGas = 0;
            }
        }
        return startIndex;
    }
}

//Time Complexity : O(n);
//Space Complexity : O(1);