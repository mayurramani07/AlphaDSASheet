package NEETCODE150;
import java.util.*;
public class ContainWithMostWater {
    public static int ContainMostWater(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while(left < right) {
            int h = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = h * width;
            maxArea = Math.max(maxArea, area);

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)