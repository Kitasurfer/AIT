package homework_21;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
Task 2
Компьютер и компоненты
Создайте базовый класс Component с полями brand (бренд) и model (модель).
Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу существовать без компьютера.
 */
public class Computer {
    private Processor processor; // Закрываем
    private Memory memory;
    private Storage storage;

    // Конструктор компьютера
    public Computer(String processorBrand, String processorModel, double clockSpeed,
                    String memoryBrand, String memoryModel, int memorySize,
                    Storage storage) {
        this.processor = new Processor(processorBrand, processorModel, clockSpeed);
        this.memory = new Memory(memoryModel, memoryBrand, memorySize);
        this.storage = storage;
    }

    // Компьютер управляет процессором, памятью и накопителем
    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Computer [processor=" + processor + ", memory=" + memory + ", storage=" + storage + "]";
    }

    public static void main(String[] args) {
        // Создаем компоненты
        Storage storage = new Storage("Samsung", "PRO", 512);
        Computer computer = new Computer ("Intel", "i5-11", 3.8,
                "Leon", "Fuji", 16, storage);


        // Выводим комп
        System.out.println(computer.toString());
        // Еще раз на новой строке
        System.out.println("========================");
        System.out.println("Компьютер состоит из: ");
        System.out.println("Processor: " + computer.getProcessor().toString());// Выводим через методы get
        System.out.println("Memory: " + computer.memory.toString());//так как они принадлежат объекту computer
        System.out.println("Storage: " + computer.getStorage().toString());

    }
}