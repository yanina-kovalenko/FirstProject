package lesson9.homework;

import java.util.Arrays;

public class UserRepository extends User {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public String[] getUserNames() {
        int count = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }
        }

        String[] results = new String[count];

        int resIndex = 0;
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null) {
                results[resIndex] = users[i].getName();
                resIndex++;
            }
        }
        return results;
    }

    public long[] getUserIds() {
        int count = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }
        }

        long[] ids = new long[count];

        int resIndex = 0;
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null) {
                ids[resIndex] = users[i].getId();
                resIndex++;
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

    public User getUserByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getName() == name) {
                return users[i];
            }
        }
        return null;
    }

    public User findById(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                return users[i];
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getSessionId() == sessionId) {
                return users[i];
            }
        }
        return null;
    }

    public User save(User user) {
        // 1. проверить существует ли такой юзер в базе
        // 2. если юзер существует - возвращать нал
        // 3. если юзер не существует - добавить и его же вернуть
        // User save(User user) - будет добавлять юзера и возвращать его
        //
        // Используйте метод с предыдущих задач для нахождение юзера по id.

//        for (int i = 0; i < users.length; i++) {
//            if (users[i] == user) {
//                return null;
//            }
//        }

        for (int i = 0; i < users.length; i++) {
            if (findById(user.getId()) == user) {
                return null;
            }
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return user;
            }
        }
        return null;
    }

    public User update(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                users[i] = user;
                return user;
            }
        }
        return null;
    }

    public void delete(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                users[i] = null;
            }
        }
    }
}
