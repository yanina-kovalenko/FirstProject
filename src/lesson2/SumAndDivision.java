package lesson2;

public class SumAndDivision {
    public static void main(String[] args) {
        //Посчитай сумму чисел на промежутке от 1 до 1000 включительно
        //Потом посчитай целую часть от деления этой суммы на число 1234, а так же остаток от деления
        //Выведи в консоль true если сумма остатка от деления больше и false в другом случае

        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
           sum += i;
        }

        int res1 = sum / 1234;
        int res2 = sum % 1234;

        System.out.println(res2 > res1);

    }
}
