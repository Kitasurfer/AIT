package homework_21; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
Класс Memory, который наследуется от Component.
Содержит дополнительное поле size (размер памяти).
 */
public class Memory extends Component {
    private int size;  // Размер памяти в ГБ
    private Computer computer;  // Связь с объектом Computer, указывающая, что память не может существовать без компьютера

    // Конструктор с параметрами
    public Memory(String brand, String model, int size, Computer computer) {
        super(brand, model); // Наследуем brand и model из класса Component
        this.size = size;
        this.computer = computer;
    }

    // Переопределение метода toString для вывода информации о памяти
    @Override
    public String toString() {
        return "[brand=" + getBrand() + ", model=" + getModel() + ", size=" + size + " GB]";
    }
}
