package DYNAMICPROGRAMMING;
import java.util.*;
public class MaxEnergyBoostFromTwoDrinks {
    public static long maxEnergyBoost(int[] energyDrinkA , int[] energyDrinkB) {
        int n = energyDrinkA.length;

        long[] dpA = new long[n];
        long[] dpB = new long[n];

        dpA[0] = energyDrinkA[0];
        dpB[0] = energyDrinkB[0];

        for(int i=1 ; i<n ; i++) {
            long continueA = dpA[i-1] + energyDrinkA[i];

            long switchA = (i >= 2 ? dpB[i-2] : 0) + energyDrinkA[i];
            dpA[i] = Math.max(continueA, switchA);

            long continueB = dpB[i-1] + energyDrinkB[i];

            long switchB = (i >= 2 ? dpA[i-2] : 0) + energyDrinkB[i];
            dpA[i] = Math.max(continueB, switchB);
        }
        return Math.max(dpA[n-1], dpB[n-1]);
    }
}
