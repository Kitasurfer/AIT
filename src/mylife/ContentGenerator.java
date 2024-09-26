package mylife;

import java.util.ArrayList;
import java.util.List;

public class ContentGenerator {
    private UserProfile userProfile;
    private LifeStatistics lifeStatistics;

    public ContentGenerator(UserProfile userProfile, LifeStatistics lifeStatistics) {
        this.userProfile = userProfile;
        this.lifeStatistics = lifeStatistics;
    }

    public List<String> generateBasicContent() {
        List<String> messages = new ArrayList<>();
        long daysLived = lifeStatistics.getDaysLived();
        long weeksLived = lifeStatistics.getWeeksLived();
        long monthsLived = lifeStatistics.getMonthsLived();

        if (daysLived == 10000) {
            messages.add("Поздравляем! Вы прожили 10 000 дней!");
        }
        if (weeksLived == 1000) {
            messages.add("Поздравляем! Вы прожили 1000 недель!");
        }
        if (monthsLived == 500) {
            messages.add("Поздравляем! Вы прожили 500 месяцев!");
        }

        // Добавьте дополнительные условия для красивых чисел

        return messages;
    }

    // Метод для генерации контента по интересам
    public List<String> generateContentByInterests() {
        List<String> messages = new ArrayList<>();

        // Пример для интереса "История"
        if (userProfile.getInterests().contains("История")) {
            // Получите исторические события из внешнего источника
            // Например, если сегодня годовщина битвы или другого события
            messages.add("В этот день 200 лет назад произошло важное историческое событие...");
        }

        // Аналогично для других интересов

        return messages;
    }
}
