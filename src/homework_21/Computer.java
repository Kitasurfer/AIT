package homework_21; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
Task 2
Компьютер и компоненты:
- Класс Computer содержит компоненты: процессор, память и накопитель.
- Компоненты Processor и Memory не могут существовать без компьютера.
*/
public class Computer {
    private Processor processor;  // Процессор компьютера
    private Memory memory;        // Память компьютера
    private Storage storage;      // Накопитель компьютера

    // Конструктор, который принимает параметры для всех компонентов компьютера
    public Computer(String processorBrand, String processorModel, double clockSpeed,
                    String memoryBrand, String memoryModel, int memorySize,
                    Storage storage) {
        this.processor = new Processor(processorBrand, processorModel, clockSpeed, this);  // Создание процессора
        this.memory = new Memory(memoryBrand, memoryModel, memorySize, this);  // Создание памяти
        this.storage = storage;  // Инициализация накопителя
    }

    // Геттер для процессора
    public Processor getProcessor() {
        return processor;
    }

    // Геттер для памяти
    public Memory getMemory() {
        return memory;
    }

    // Геттер для накопителя
    public Storage getStorage() {
        return storage;
    }

    // Переопределение метода toString для вывода информации о компьютере
    @Override
    public String toString() {
        return "Computer [processor=" + processor + ", memory=" + memory + ", storage=" + storage + "]";
    }

    // Главный метод, который выводит информацию о созданном компьютере и его компонентах
    public static void main(String[] args) {
        // Создаем объект накопителя
        Storage storage = new Storage("Samsung", "PRO", 512);

        // Создаем объект компьютера с параметрами процессора, памяти и накопителя
        Computer computer = new Computer("Intel", "i5-11", 3.8,
                "Leon", "Fuji", 16, storage);

        // Выводим информацию о компьютере
        System.out.println(computer.toString());
        System.out.println("========================");
        System.out.println("Компьютер состоит из: ");
        System.out.println("Processor: " + computer.getProcessor());  // Выводим процессор через геттер
        System.out.println("Memory: " + computer.getMemory());  // Выводим память через геттер
        System.out.println("Storage: " + computer.getStorage());  // Выводим накопитель через геттер
    }
}
