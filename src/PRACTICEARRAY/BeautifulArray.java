package PRACTICEARRAY;
import java.util.*;
public class BeautifulArray {
    public static int BeautyArray(int[] nums) {
        int n = nums.length;

        int totalEven = 0;
        int totalOdd = 0;

        for(int i=0; i<n; i++) {
            if (i % 2 == 0) {
                totalEven += nums[i];
            } else {
                totalOdd += nums[i];
            }
        }

        int leftEven = 0, leftOdd = 0;
        int rightEven = totalEven, rightOdd = totalOdd;

        int count = 0;

        for(int i=0; i<n; i++) {
            if(i % 2 == 0) {
                rightEven -= nums[i];
            } else {
                rightOdd -= nums[i];
            }
            if(leftEven + rightOdd == leftOdd + rightEven) {
                count++;
            }
            if(i % 2 == 0) {
                leftEven += nums[i];
            } else {
                leftOdd += nums[i];
            }
        }
        return count;
    }
}
