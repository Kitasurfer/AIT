package homework_15; // Указываем, что класс находится в пакете lesson_15

/*
 * Класс Student представляет студента с именем, возрастом и специальностью.
 */
public class Student {
    String name;  // Имя студента
    int age;      // Возраст студента
    String major; // Специальность студента

    // Конструктор класса Student
    public Student(String name, int age, String major) {
        // Проверяем, что возраст в допустимых пределах
        if (age <= 0 || age > 100) {
            throw new IllegalArgumentException("Возраст должен быть между 1 и 100.");
        }
        // Проверяем, что имя не пустое
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
        this.name = name;
        this.age = age;
        // Если специальность не указана, устанавливаем значение по умолчанию
        this.major = (major != null && !major.isEmpty()) ? major : "В области неопределенности";
    }

    // Метод для вывода информации о студенте
    public void whoAmI() {
        System.out.printf("Я %s, мне %d лет, моя специальность: %s.\n", name, age, major);
    }
}
