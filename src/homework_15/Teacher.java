package homework_15;

/*
 * Класс Teacher представляет преподавателя с именем, предметом и стажем работы.
 */
public class Teacher {
    String name;         // Имя преподавателя
    String subject;      // Предмет, который ведет преподаватель
    int experienceYears; // Стаж работы в годах

    // Конструктор класса Teacher
    public Teacher(String name, String subject, int experienceYears) {
        // Проверяем, что стаж работы в допустимых пределах
        if (experienceYears < 0 || experienceYears > 50) {
            throw new IllegalArgumentException("Стаж работы должен быть между 0 и 50 годами.");
        }
        // Проверяем, что имя не пустое
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
        this.name = name;
        // Если предмет не указан, устанавливаем значение по умолчанию
        this.subject = (subject != null && !subject.isEmpty()) ? subject : "Общий";
        this.experienceYears = experienceYears;
    }

    // Метод для вывода информации о преподавателе
    public void whoAmI() {
        System.out.printf("Я %s, преподаю %s уже %d лет.\n", name, subject, experienceYears);
    }
}
