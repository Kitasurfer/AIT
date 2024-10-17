package lesson_26.boxes; // Указание пакета, к которому принадлежит класс, что помогает структурировать код проекта

/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 17-10-2024
*/
// Комментарий с информацией о группе, авторе и дате создания файла. Это полезно для отслеживания изменений и версий

public class SuperBoxDouble {
    // Объявление публичного класса `SuperBoxDouble`, предназначенного для хранения и работы с типом данных double

    private double value;
    // Приватное поле `value` типа double. Модификатор доступа private защищает его от прямого изменения извне класса

    public SuperBoxDouble(double value) {
        // Конструктор класса, принимающий параметр типа double и инициализирующий поле `value`
        this.value = value;
        // Использование `this.value` для явного указания, что значение присваивается полю текущего объекта
    }

    public double getValue() {
        // Метод-геттер для получения значения поля `value`. Возвращает текущее значение поля `value`
        return value;
    }

    public void setValue(double value) {
        // Метод-сеттер для изменения значения поля `value`. Позволяет контролировать изменение этого поля извне
        this.value = value;
    }

    @Override
    public String toString() {
        // Переопределение метода `toString()` для возврата строкового представления объекта `SuperBoxDouble`
        return "SuperBoxDouble{" +
                "value=" + value +
                '}';
        // Форматированный вывод, который включает имя класса и текущее значение поля `value`. Полезно для отладки и вывода информации
    }
}
