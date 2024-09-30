package homework_15;

/*
 * Класс Doctor представляет врача с именем, специальностью и стажем работы.
 */
public class Doctor {
    String name;         // Имя врача
    String specialty;    // Специальность врача
    int experienceYears; // Стаж работы в годах

    // Конструктор класса Doctor
    public Doctor(String name, String specialty, int experienceYears) {
        // КЗ, что стаж работы в допустимых пределах
        if (experienceYears < 0 || experienceYears > 50) {
            throw new IllegalArgumentException("Стаж работы должен быть между 0 и 50 годами.");
        }
        // КЗ, что имя не пустое
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым.");
        }
        this.name = name; // Указываем на имя в String
        // Если специальность не указана, устанавливаем значение по умолчанию
        this.specialty = (specialty != null && !specialty.isEmpty()) ? specialty : "Медицины";

        this.experienceYears = experienceYears;
    }

    // Метод для вывода информации о враче
    public void whoAmI() {
        System.out.printf("Я доктор %s, специализируюсь в области %s, стаж работы %d лет.\n", name, specialty,
                experienceYears);
    }
}
