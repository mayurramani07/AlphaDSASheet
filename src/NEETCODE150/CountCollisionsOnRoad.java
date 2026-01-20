package NEETCODE150;
import java.util.*;
public class CountCollisionsOnRoad {
    public static int CountCollisions(String direction) {
        int left = 0;
        int right = direction.length() - 1;

        while(left < direction.length() && direction.charAt(left) == 'L') {
            left++;
        }
        while(right >= 0 && direction.charAt(right) == 'R') {
            right--;
        }

        int collisions = 0;
        for(int i = left ; i<=right ; i++) {
            if(direction.charAt(i) != 'S') {
                collisions++;
            }
        }
        return collisions;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)