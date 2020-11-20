package lesson2;

public class ForLoopExample {
    public static void main(String[] args) {

        for(int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        //initialization - condition - update
        int a = 1;
        for(; a <= 10;) {
            System.out.println(a);
            a++;
        }
    }
}
