package lesson8.arithmetics;

public class Adder extends Arithmetic {

    public Adder(int sum) {
        super(sum);
    }

    public static void main(String[] args) {
        System.out.println(add(3, 5));
    }

    public static int add(int a, int b) {
        return sum = a + b;
    }
}
