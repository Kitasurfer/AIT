package homework_31;
/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 24-10-2024
*/

/*
Task 1
Реализуйте Enum для определения четырех времен года с методами, возвращающими среднюю температуру для каждого
времени года.
 */
// enum для четырех сезонов:
public enum Season {
    SPRING(15, "Весны", "Средняя температура для весны — пора пробуждения природы."),
    SUMMER(25, "Лета", "Средняя температура для лета — пора отпуска."),
    AUTUMN(10, "Осени", "Средняя температура для осени — время сбора урожая."),
    WINTER(-5, "Зимы", "Средняя температура для зимы — сезон холода и снега.");

    private final int averageTemperature;// Средняя температура
    private final String fourSeasons;// Название сезона в родительном падеже
    private final String description;// Описание сезона


    // Конструктор enum
    Season(int averageTemperature, String fourSeasons, String description) {
        this.averageTemperature = averageTemperature; // присваиваем среднюю температуру
        this.fourSeasons = fourSeasons;// присваиваем название сезона в родительском падеже
        this.description = description;// описание сезона

    }
    // метод который будет возвращать советы в зависимости от сезона
    public String getClothingAdvice() {
        String advice = "Совет по одежде для " + fourSeasons + ": ";  // Используем правильное окончание
        if (averageTemperature > 24) {
            advice += "Наденьте легкую одежду на улице тепло!";
        } else if (averageTemperature > 14) {
            advice += "Наденьте кофту или куртку!";
        } else if (averageTemperature > 0) {
            advice += "Одевайтесь теплее, может быть прохладно.";
        } else {
            advice += "Наденьте зимнюю одежду, очень холодно!";
        }
        return advice;
    }

    // при определении метода toString для вывода информации о сезоне
    @Override
    public String toString() {
        return description + ": " + averageTemperature + "\u00B0C. " + " " + getClothingAdvice();
    }// выводит описание сезона, среднюю температуру и советы по одежде

    public static void main(String[] args) {
        for (Season season : Season.values()) { // проходим по всем элементам enum
            System.out.println(season); // выводим информацию в нужном нам виде о каждом сезоне
        }
    }
}
