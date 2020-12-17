package lesson9.homework;

import java.util.Arrays;

import lesson9.homework.UserRepository;
import lesson9.homework.User;

public class Demo {
    public static void main(String[] args) {
        User user = new User(88888, "Alina3", "105");
        User user2 = new User(555555, "Emma", "99");

        User name = new User();
        User id = new User();
        User sessionId = new User();

        User[] users = new User[10];
        users[0] = new User(555555, "Emma", "99");
        users[1] = new User(565656, "Jeniffer", "100");
        users[2] = new User(333333, "Johnny", "101");
        users[3] = new User(444444, "Amber", "102");
        users[4] = new User(66666, "Alina", "103");
        users[5] = new User(77777, "Alina2", "104");
        System.out.println(users);

        UserRepository userRepository = new UserRepository(users);
        System.out.println(userRepository);

        System.out.println(Arrays.toString(userRepository.getUserNames()));

        System.out.println(Arrays.toString(userRepository.getUserIds()));

        System.out.println(userRepository.getUserNameById(333333));

//        System.out.println(users[0]);
        System.out.println(userRepository.getUserByName("Jeniffer"));

        System.out.println(userRepository.getUserBySessionId("101"));


        /*
        case 1 to show newly added user
        System.out.println(userRepository.save(users[6] = new User(88888, "Alina3", "105")));
        System.out.println(Arrays.toString(userRepository.getUserNames()));
        System.out.println(userRepository.save(users[7] = new User(9999, "Alina4", "106")));
        System.out.println(Arrays.toString(userRepository.getUserNames()));
        */

       /*
        case 2 to show newly added user
        System.out.println(userRepository.save(user2));
        System.out.println(Arrays.toString(userRepository.getUserNames()));
        */

       // case 3 to show newly added user
        userRepository.save(user);
        System.out.println(Arrays.toString(userRepository.getUserNames()));
        userRepository.save(user2);
        System.out.println(Arrays.toString(userRepository.getUserNames()));

        // for update user
        System.out.println(userRepository.update(users[5] = new User(99999, "Alina4", "106")));
        System.out.println(userRepository.update(users[1] = users[3]));

        System.out.println(userRepository.update(user));
        System.out.println(Arrays.toString(userRepository.getUserNames()));
        System.out.println(Arrays.toString(userRepository.getUserIds()));

        // for delete user
        userRepository.delete(66666);
        System.out.println(Arrays.toString(userRepository.getUserNames()));
        System.out.println(Arrays.toString(userRepository.getUserIds()));
    }
}
