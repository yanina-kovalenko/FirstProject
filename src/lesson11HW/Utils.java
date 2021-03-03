package lesson11HW;

public class Utils {
    public static boolean checkIsValueInRange(int value, int userValue, int range) {
        if (value >= (userValue - range) && value <= (userValue + range)) {
            return true;
        }
        return false;
    }
}
