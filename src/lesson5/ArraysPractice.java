package lesson5;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] array = {-10, 0, 110, 555, 1000, -45, 0, 60, 10};
        System.out.println(maxElement(array));
        System.out.println(nCount(array, 10));
    }

    // find max element of massive
    public static int maxElement(int[] array) {
        int max = array[0];
        for (int el : array) {
            if (el > max)
                max = el;
        }
        return  max;
    }

    //найти каличество вхождений числа n в массив
    public static int nCount(int[] array, int n) {
        int count = 0;

        for(int el : array) {
            if (el == n)
                count++;
        }
        return count;
    }

}
