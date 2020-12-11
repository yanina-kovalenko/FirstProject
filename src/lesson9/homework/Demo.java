package lesson9.homework;

import java.util.Arrays;

import lesson9.homework.UserRepository;
import lesson9.homework.User;

public class Demo {
    public static void main(String[] args) {
        User user = new User();

        User name = new User();
        User id = new User();
        User sessionId = new User();

        User[] users = new User[10];
        users[0] = new User(555555, "Emma", "99");
        users[1] = new User(565656, "Jeniffer", "100");
        users[2] = new User(333333, "Johnny", "101");
        users[3] = new User(444444, "Amber", "102");
        System.out.println(users);

        UserRepository userRepository = new UserRepository(users);
        System.out.println(userRepository);

        System.out.println(Arrays.toString(userRepository.getUserNames()));

        System.out.println(Arrays.toString(userRepository.getUserIds()));

        System.out.println(userRepository.getUserNameById(333333));

//        System.out.println(users[0]);
        System.out.println(userRepository.getUserByName("Jeniffer"));

        System.out.println(userRepository.getUserById(444444));

        System.out.println(userRepository.getUserBySessionId("101"));
    }
}
