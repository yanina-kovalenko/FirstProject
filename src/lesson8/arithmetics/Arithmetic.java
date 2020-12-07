package lesson8.arithmetics;

import java.util.Arrays;

public class Arithmetic {
    static int sum;

    public Arithmetic(int sum) {
        this.sum = sum;
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 100, 30, 98, 50};

        System.out.println(Arrays.toString(array));

        System.out.println(maxElement(array));
        System.out.println(minElement(array));

        System.out.println(check(array));
    }

    // find max element of massive
    public static int maxElement(int[] array) {
        int max = array[0];
        for (int el : array) {
            if (el > max)
                max = el;
        }
        return max;
    }

    // find min element of massive
    public static int minElement(int[] array) {
        int min = array[0];
        for (int el : array) {
            if (el < min)
                min = el;
        }
        return min;
    }

    public static boolean check(int[] array) {
        int sum = minElement(array) + maxElement(array);
        System.out.println(sum);
        return sum > 100;
    }
}


