package lesson9.homework;

public class User {
    private long id;
    private String name;
    private String sessionId;

    public User() {
    }

    public static void main(String[] args) {
        User user = new User();
        User name = new User(456789, "Yana", "8");
        User id = new User(909090, "Nadia", "9");
        User sessionId = new User(23232323, "Nastia", "10");
    }

    public User(long id, String name, String sessionId) {
        this.id = id;
        this.name = name;
        this.sessionId = sessionId;
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
