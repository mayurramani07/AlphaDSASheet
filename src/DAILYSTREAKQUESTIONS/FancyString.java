package DAILYSTREAKQUESTIONS;
import java.util.*;
public class FancyString {
    public static String makeFancyString(String s){

        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            int len = sb.length();

            if(len >= 2 && sb.charAt(len - 1) == ch && sb.charAt(len - 2) == ch) {
                continue;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
