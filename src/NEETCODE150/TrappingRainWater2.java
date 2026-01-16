package NEETCODE150;
import java.util.*;
public class TrappingRainWater2 {
    public static int TrappingRainWater2(int[] heights) {
        int n = heights.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = heights[0];
        for(int i=1; i< heights.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        rightMax[n-1] = heights[n-1];
        for(int j=1; j<heights.length; j++) {
            rightMax[j] = Math.max(rightMax[j-1], heights[j]);
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            ans += Math.min(leftMax[i], rightMax[i] - heights[i]);
        }
        return ans;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)