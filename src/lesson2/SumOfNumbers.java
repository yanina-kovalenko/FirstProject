package lesson2;

public class SumOfNumbers {
    public static void main(String[] args) {
        //В main методе посчитай сумму чисел на промежутке от 0 до 10 миллионов включительно. Результат выводи в консоль.
//        // case 1 using for loop
//        long  sum = 0;
//        for(int i = 0; i <= 10000000; i++) {
//            sum += i;
//            System.out.println(sum);
//        }

        // case 2 using while loop
        int i = 0;
        long sum = 0;
        while (i <= 10000000) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
