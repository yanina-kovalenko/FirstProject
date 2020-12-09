package lesson9.homework;

import java.util.Arrays;

public class UserRepository extends User {
    private User[] users;

    public static void main(String[] args) {
        User[] users = new User[3];
        UserRepository userRepository = new UserRepository(users);
        System.out.println(Arrays.toString(getUserNames()));
        System.out.println(Arrays.toString(getUserIds()));
        userRepository.getUserNameById(6);
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
        long[] id = {43242, 342243, 34325354};
        return id;
    }

    public String getUserNameById(long id) {
        return this.getName();
    }
}
