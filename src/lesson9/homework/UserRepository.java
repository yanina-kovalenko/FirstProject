package lesson9.homework;

import java.util.Arrays;

public class UserRepository extends User {
    private User[] users;

    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User(555555, "Emma", "5");
        users[1] = new User(565656, "Jeniffer", "100");
        users[2] = new User(333333, "Elison", "101");

        UserRepository userRepository = new UserRepository(users);
        System.out.println(Arrays.toString(getUserNames()));
        System.out.println(Arrays.toString(getUserIds()));
        userRepository.getUserNameById(6);

        System.out.println(userRepository.getUserByName("Nadia"));
        System.out.println(userRepository.getUserBySessionId("10"));
        System.out.println( userRepository.getUserById(342243));

        System.out.println(userRepository.findById(909090));
        userRepository.save(users[4]);


    }

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public static String[] getUserNames() {
        String[] name = {"Yana", "Nadia", "Nastia"};
        return name;
    }

    public static long[] getUserIds() {
        long[] id = {43242, 909090, 34325354};
        return id;
    }

    public String getUserNameById(long id) {
        return this.getName();
    }

    public String getUserByName(String name) {
        return this.getName();
    }

    public long getUserById(long id) {
        return this.getId();
    }

    public String getUserBySessionId(String sessionId) {
        return this.getSessionId();
    }

    public User save(User user) {

        for(int i = 0; i < users.length; i++) {
            users[i] = users[i++];
        }
        return user;
    }

    private long findById(long id) {
        return this.getId();
    }


}
