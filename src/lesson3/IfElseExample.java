package lesson3;

public class IfElseExample {
    public static void main(String[] args) {
        int test = 1000;

        // case 1 with brackets
        if (test > 100) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }

        //case 2 without brackets if only one line is in body
        if (test > 100)
            System.out.println("Good");
         else
            System.out.println("Bad");

         //if(condition) {
        // if-body
        //}
        //else {
        // else-body
        // }

        int test1 = 1000;
        boolean result = false;

        if (test1 > 1000) {
            result = true;
        }

        if (result)
            System.out.println("Nice");
        else
            System.out.println("Not nice");

        if (result && test1 > 100 && test > 500) {
            System.out.println("!");
        }
        else {
            System.out.println("?");
        }

        if (result && test1 > 100 || test > 500) {
            System.out.println("!");
        }
        else {
            System.out.println("?");
        }

        // operator '!'
        if (!(test1 > 0)) {
            System.out.println("!!!!!!");
        }
    }

}
