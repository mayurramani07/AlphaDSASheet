package TWOPOINTERS1;

public class ValidPalindromeOptimized {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)
