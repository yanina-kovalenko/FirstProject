package lesson4;

public class MethodExample {

    public static void main(String[] args) {
        //case 1:
//       int res = increaser(5, 20);
//        System.out.println(res);

        //case 2:
        System.out.println(increaser(5, 20));
        System.out.println(min(increaser(5, 20),11));
    }

    public static int increaser(int a, int delta) {
        System.out.println("method invoked");
        a += delta;
        System.out.println("method before return");
        return a;
    }

    public static int min(int a, int b) {
    /* if (a < b)
            return a;
        else
            return b;*/
        return a < b ? a : b;
    }
}
