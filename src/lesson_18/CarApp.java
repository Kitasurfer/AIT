package lesson_18;

public class CarApp {
    public static void main(String[] args) {

        System.out.printf("Static before: ");
        System.out.println(Car.totalCarProduced);

        Car car = new Car("BMW", 200);
        System.out.println(car.toString());

        Car car2 = new Car("Tesla", 1000);
        System.out.println(car2.toString());

        Car car3 = new Car("Mercedes", 2000);
        System.out.println(car3.toString());

        System.out.printf("Static after: "); // Изменил метку на более логичную
        System.out.println(Car.totalCarProduced);

        Car.testStatic();

        // Суммируем два целых числа с помощью MathUtils
        int sum = MathUtils.sumOfInts(25, 10); // Вызов метода из MathUtils
        System.out.println("Sum of 25 and 10: " + sum);
    }
}
