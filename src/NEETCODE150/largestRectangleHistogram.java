package NEETCODE150;
import java.util.*;
public class largestRectangleHistogram {
    public static int LargestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for(int i=0; i<=n ; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int left = (stack.isEmpty()) ? -1 : stack.peek();
                int width = i - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)