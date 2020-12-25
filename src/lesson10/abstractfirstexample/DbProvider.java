package lesson10.abstractfirstexample;

public abstract class DbProvider {

    /*
    Theory:
    1. Abstract class objects cannot be created (but can be created in child class using constructors);
    2. Abstract class can contain abstract methods (without behavior description)  and contain nothing;
    3. Abstract class can contain non-abstract / simple methods (with behavior description);
    4. Abstract class can contain simple fields;
    5. Abstract class can contain constructor which will be used his child only;
    6. If Abstract class contains a child class, this class should implement all abstract methods.
    7. Abstract class defines general behavior for his child classes.
     */

    private String dbHost;

//    public DbProvider(String dbHost) {
//        this.dbHost = dbHost;
//    }

    // method without behavior description
    abstract void connectToDb();

    abstract void disconnectFromDb();

    // method with behavior description
    void printDbHost() {
        System.out.println("DB host is" + dbHost);
    }
}
