package lesson4;

public class Concat {
    public static void main(String[] args) {
        System.out.println(concat("str1", "str2", "str3"));
    }

    public static String concat(String a, String b, String c) {
        //Напишите метод который будет конкатенировать строки
        //Метод принимает три String параметра и должен возвращать результат их конкатенации
        String res = a + b + c;
        return res;
    }

    //

}
