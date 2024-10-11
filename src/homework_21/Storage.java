package homework_21; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
Класс Storage, который наследуется от Component.
Содержит дополнительное поле capacity (емкость накопителя).
 */
public class Storage extends Component {
    private int capacity;  // Емкость накопителя в ГБ

    // Конструктор с параметрами
    public Storage(String brand, String model, int capacity) {
        super(brand, model); // Наследуем brand и model из класса Component
        this.capacity = capacity;
    }

    // Переопределение метода toString для вывода информации о накопителе
    @Override
    public String toString() {
        return super.toString() + ", capacity=" + capacity + " GB";
    }
}
