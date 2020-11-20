package lesson4;

public class PracticeExample {
    public static void main(String[] args) {
        System.out.println(min(2, 5, 10));
        System.out.println(min(10, 5, 2));
        System.out.println(min(10, 5, 10));

        System.out.println(average(2));
        System.out.println(average(10));

        System.out.println(average(2, 5)); // 2 + 3 + 4 + 5 = 14 / 4
        System.out.println(count(1, 100, 5));
    }

    // знайти менше з трьох чисел
    public static int min(int a, int b, int c) {
        int res = a < b ? a : b;
        return res < c ? res : c;
    }

    // знайти середнє арифметичне на проміжку
    public static double average(int n) {
        //2-5 : {2,3,4,5} = b - a + 1
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return (double) sum / n;
    }

    public static double average(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return (double) sum / (b - a + 1);
    }

    // на проміжку знайти кількість чисел, які закінчуються на n
    public static int count(int a, int b, int n) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 10 == n) {
                count++;
            }
        }
        return count;
    }

}
