package lesson4;

public class CompareSums {
    public static void main(String[] args) {
        System.out.println(compareSums(5, 10, 1,5));
        System.out.println(compareSums(5, 5, 5,5));
        System.out.println(compareSums(3, 5, 7,10));
    }

    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
           sum += i;
        }
        return sum;
    }

    public static int sum2(int c, int d) {
        int sum2 = 0;
        for (int i = c; i <= d; i++) {
            sum2 += i;
        }
        return sum2;
    }

    public static boolean compareSums(int a, int b, int c, int d) {
        int res1 = sum(a, b) ;
        int res2 = sum2(c, d) ;
        if (res1 > res2) {
            return true;
        }
        else {
            return false;
        }
    }
}
