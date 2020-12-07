package lesson8.arithmetic;

public class Demo {
    public static void main(String[] args) {
        int[] array = {2, 6, 100, 30, 98, 50};

        Adder adder = new Adder(Adder.sum);
        System.out.println(adder.check(array));
        System.out.println(adder.add(3, 5));
    }
}
