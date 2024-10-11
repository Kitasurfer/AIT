package homework_21; /* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*
Базовый класс Component, который содержит общие поля для всех компонентов:
brand (бренд) и model (модель).
 */
public class Component {
    private String brand;
    private String model;

    // Конструктор для инициализации полей brand и model
    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Геттер для получения brand
    public String getBrand() {
        return brand;
    }

    // Геттер для получения model
    public String getModel() {
        return model;
    }

    // Переопределение метода toString для вывода информации о компоненте
    @Override
    public String toString() {
        return "Component [brand=" + brand + ", model=" + model + "]";
    }
}
