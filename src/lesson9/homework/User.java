package lesson9.homework;

public class User {
    private long id;
    private String name;
    private String sessionId;

    public static void main(String[] args) {
        User name = new User();
        User id = new User();
        User sessionId = new User();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSessionId() {
        return sessionId;
    }
}
