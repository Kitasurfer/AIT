package homework_03;

/*
Task 3 * (Опционально)
Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.

Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
Отдельно выведите на экран сумму скидки для этой покупки (в деньгах).
 */
public class HomeWork_03_3 {
    public static void main(String[] args) {
        // Стоимость товаров A и B
        double priceA = 1000;
        double priceB = 500;

        // Общая стоимость без скидки
        double totalPrice = priceA + priceB;

        // Скидка 10%
        double discount = (totalPrice * 10) / 100;

        // Стоимость со скидкой
        double priceWithDiscount = totalPrice - discount;

        // Выводим результаты
        System.out.println("Стоимость товаров A+B со скидкой: " + priceWithDiscount + " евро");
        System.out.println("Сумма скидки: " + discount + " евро");
        /* Ответ
        Стоимость товаров A+B со скидкой: 1350.0 евро
        Сумма скидки: 150.0 евро
         */
    }
}
