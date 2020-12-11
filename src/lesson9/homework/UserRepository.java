package lesson9.homework;

import java.util.Arrays;

public class UserRepository extends User {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public String[] getUserNames() {
        String[] names = new String[users.length];

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                names[i] = users[i].getName();
            }
        }
        return names;
    }

    public long[] getUserIds() {
        long[] ids = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                ids[i] = users[i].getId();
            }
        }
        return ids;
    }

    // метод для получения имени пользователя по його id
    public String getUserNameById(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                return users[i].name;
            }
        }
        return null;
    }
}
