package lesson5;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {
        int a; // declaration
        a = 10; // initialization

        //type of array [] name of array = new type of array[length of array]
        int[] firstArray = new int[4]; // declaration
        System.out.println(Arrays.toString(firstArray));

        // array name [index] - get array element
        firstArray[0] = 11;
        firstArray[1] = 200;
        firstArray[2] = -10;

//        System.out.println(firstArray[0]);
//        System.out.println(firstArray[1]);
//        System.out.println(firstArray[2]);

        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
        System.out.println(Arrays.toString(firstArray));

        int b = 10;
        int[] secondArray = {1, 10, 15, 20, -50}; // priority case
        System.out.println(Arrays.toString(secondArray));

        // for-each loop
        // використовують для того, щоб пройтись по елемантах в структурі даних
        for (int element : secondArray) {
            System.out.println(element);
        }

        // difference between for and for-each.
        for (int i = 0; i < firstArray.length; i++) {
            int element = firstArray[i];
            System.out.println(element);
        }

    }
}
