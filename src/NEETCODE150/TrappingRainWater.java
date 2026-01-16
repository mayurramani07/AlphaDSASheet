package NEETCODE150;
import java.util.*;
public class TrappingRainWater {
    public static int TrappingRain(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        rightMax[n-1] = height[n-1];
        for(int j=0; j<height.length; j++) {
            rightMax[j] = Math.max(rightMax[j+1], height[j]);
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            ans += Math.min(leftMax[i], rightMax[i] - height[i]);
        }
        return ans;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)
