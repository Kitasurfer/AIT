package homework_44;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 12-11-2024
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Task 4 Опционально
 * Напишите метод findUserById(int id), который возвращает Optional<User>. Метод принимает List<User> и int id.
 * Если пользователь с заданным id существует в списке, вернуть Optional с пользователем, иначе вернуть Optional.empty().
 * <p>
 * Подсказка:
 * Используйте Optional.of(user) или Optional.empty().
 */
public class Task_4 {
    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "User{id=" + id + ", name=" + name + '}';
        }
    }

    public static class UserService {
        public static Optional<User> findById(List<User> users, int id) {
            return users.stream()
                    .filter(user -> user.getId() == id)
                    .findFirst();
        }
    }

    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, "Елена"),
                new User(2, "Игорь"),
                new User(3, "Иван")
        );
        int searchId = 2;
        Optional<User> user = UserService.findById(users, searchId);

        user.ifPresentOrElse(
                u -> System.out.println("Найден пользователь: " + u),
                () -> System.out.println("Пользователь с id=" + searchId + " не найден")
        );

    }

}

