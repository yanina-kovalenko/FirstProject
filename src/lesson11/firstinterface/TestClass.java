package lesson11.firstinterface;

public class TestClass implements FirstInterface {

    private int test = 0;

    @Override
    public void send() {
        //some logic
    }

    @Override
    public String receive() {
        //some logic
        return null;
    }
}
