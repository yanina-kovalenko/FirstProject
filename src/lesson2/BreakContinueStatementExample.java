package lesson2;

public class BreakContinueStatementExample {
    public static void main(String[] args) {
        int test = 10;

        //break example
//        while (test > 0) {
//            System.out.println(test);
//            System.out.println("...");
//            test--;
//            break;
//        }

        //continue example
        while (test > 0) {
            System.out.println(test);
            System.out.println("...");
            test--;
        }

        System.out.println("done");
    }
}
