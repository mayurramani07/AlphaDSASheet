package LCTOP150;
import java.util.*;
public class LongPressedName2 {
    public static boolean LongPressed(String name, String typed) {
        int i = 0;
        int j = 0;

        while(j < typed.length()) {
            if(i < name.length() && name.charAt(i) == typed.charAt(i)) {
                i++;
                j++;
            } else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }
}
