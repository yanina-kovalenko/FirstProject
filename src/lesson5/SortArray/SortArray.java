package lesson5.ArraySorting;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {2, 30, 15, 7, 8, 29};

        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));
    }

   public static int[] sortAscending(int[] array) {
        int n = array.length;
        int temp = 0;

        for (int i= 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }

        }

        return array;
    }

    public static int[] sortDescending(int[] array) {
        int n = array.length;
        int temp = 0;

        for (int i= 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (array[j-1] < array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }

        }

        return array;
    }

}
