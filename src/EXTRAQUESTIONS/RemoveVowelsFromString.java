package EXTRAQUESTIONS;
import java.util.*;
public class RemoveVowelsFromString {
    public static String vowels(String s) {
        return s.replaceAll("[aeiou]", "");
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)