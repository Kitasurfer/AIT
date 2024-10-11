package homework_21; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
Класс Processor, который наследуется от Component.
Содержит дополнительное поле clockSpeed (частота процессора).
 */
public class Processor extends Component {
    private double clockSpeed;  // Частота процессора
    private Computer computer;  // Связь с объектом Computer, указывающая, что процессор не может существовать без компьютера

    // Конструктор с параметрами
    public Processor(String brand, String model, double clockSpeed, Computer computer) {
        super(brand, model); // Наследуем brand и model из класса Component
        this.clockSpeed = clockSpeed;
        this.computer = computer;
    }

    // Переопределение метода toString для вывода информации о процессоре
    @Override
    public String toString() {
        return "[brand=" + getBrand() + ", model=" + getModel() + ", clockSpeed=" + clockSpeed + " GHz]";
    }
}
