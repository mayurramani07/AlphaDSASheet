package TWOPOINTERS1;
import java.util.*;
public class ContainerWithMostWater {
    public static int MostWater(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while(left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)