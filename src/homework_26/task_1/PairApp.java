/* Group: 52-1, "AIT Hi-tech team" GMBH
Author: Bogdan Fesenko
Date: 18-10-2024
*/

import homework_26.task_1.Pair;/*

 */
// Пример использования класса Pair
public static void main(String[] args) {
    // Создаем объект Pair с двумя строковыми значениями
    Pair<String> pair = new Pair<>("Hello", "World");
    // Выводим первое и второе значения
    System.out.println(pair.getFirst()); // Вывод: Hello
    System.out.println(pair.getSecond()); // Вывод: World
    // Меняем местами значения
    pair.swap();
    // Выводим значения после обмена
    System.out.println(pair.getFirst()); // Вывод: World
    System.out.println(pair.getSecond()); // Вывод: Hello
}
