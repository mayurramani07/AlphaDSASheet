package LC2TOP150;
import java.util.*;
public class CalcMoneyInLeetcodeBank {
    public static int CalcMoney(int n) {
        int total = 0;
        int weekStart = 1;
        int totalDays = 0;

        for(int i=1 ; i<=n ; i++) {
            total += weekStart + totalDays;
            totalDays++;

            if(totalDays == 7) {
                totalDays = 0;
                weekStart=+;
            }
        }
        return total;
    }
}
