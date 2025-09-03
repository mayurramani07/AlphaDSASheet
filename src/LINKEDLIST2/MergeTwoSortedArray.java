package LINKEDLIST2;
import java.util.*;
public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int n, int[] nums2) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0) {
            if(i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}

//Time Complexity - O(n)
//Space Complexity - O(1)
