package homework_40;

/// Group: 52-1, "AIT Hi-tech team" GMBH
/// Author: Bogdan Fesenko
/// Date: 06-11-2024

/// Task 4
/// Опционально
/// Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
/// Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
/// Создайте 4 метода, принимающий реализацию интерфейса List.
/// В первом методе - получение всех значений элементов списка по индексу (перебрать все индексы,
/// взять значение по текущему индексу)
/// Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
/// Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
/// Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
/// Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
/// Сравните для каждого из списка время выполнения каждого метода.
/// И сравните время последовательного выполнения всех методов для каждой реализации List-а.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Task_4 {
    public static final int INITIAL_SIZE = 50_000; // начальный размер списка
    public static final int INSERTIONS = 20_000; // Количество вставок для второго метода
    public static final int DELETION_BY_INDEX = 10_000; // Количество удалений по индексу
    public static final int DELETION_BY_VALUE = 10_000;// удаления по значению

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(); // ArrayList для тестирования
        List<Integer> linkedList = new LinkedList<>();// также LinkedList

        // Заполняем случайными значениями
        populateList(arrayList);
        populateList(linkedList);

        System.out.println("\n Тест для - ArrayList: ");
        measurePerformance(arrayList);

        System.out.println("\n Тест для - LinkedList: ");
        measurePerformance(linkedList);
    }
    //заполнения списка случайными значениями от 0 до 1000
    private static void populateList(List<Integer> list) {
        Random random = new Random();//генерируем
        for (int i = 0; i < INITIAL_SIZE; i++) { // цикл для вставки элементов
            list.add(random.nextInt(1_001)); // Добавляем случайное число от 0 до 1000

        }
    }

    private static void measurePerformance(List<Integer> list) {
        long timeGet = getAllValues(list); //получение всех значений по индексу
        System.out.printf("Время на получение всех значений по индексу - Time get: %d mc%n", timeGet);// вывод времени на получение всех значений по индексу

        long timeInsert = insertRandomValues(list); // время на вставку всех зн по индексу
        System.out.printf("Время на добавление 2000 случ элемент - Time insert: %d mc%n", timeInsert);

        long timeDeleteByIndex = deleteRandomValuesByIndex(list); // время на удал по индексу
        System.out.printf("Время на удаление 1000 эл по индексу - Time delete by index: %d mc%n",  timeDeleteByIndex);

        long timeDeleteValue = deleteRandomValuesByValue(list); // по значению
        System.out.printf("Время на удаление 1000 эл по значению - Time delete value: %d mc%n", timeDeleteValue);

        long total = timeGet + timeInsert + timeDeleteByIndex + timeDeleteValue; // сумма всех времен
        System.out.printf("Общее время всех операций - Total time: %d mc%n",   total);
    }
    //получение всех значений по индексу
    private static long getAllValues(List<Integer> list) { // начальное время
        long startTime = System.currentTimeMillis(); // проходим по ккждому индексу
        for (int i = 0; i < list.size(); i++) {
            list.get(i);

        }
        return System.currentTimeMillis() - startTime;
    }
    //рамдомные значения случайных индексов
    private static long insertRandomValues(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis(); // фиксируем начальное врея
        for (int i = 0; i < INSERTIONS; i++) {
            int index = random.nextInt(list.size());
            int value = random.nextInt(1_001);
            list.add(index, value);
        }
        return System.currentTimeMillis() - startTime;
    }
    // метод удаления случайных индексов
    private static long deleteRandomValuesByIndex(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < DELETION_BY_INDEX; i++) {
            if (list.isEmpty()){
                break; // Если пусто то стоп удаление
            }
            int index = random.nextInt(list.size());
            list.remove(index);
        }
        return System.currentTimeMillis() - startTime;
    }
    // метод удаления случайных значений
    private static long deleteRandomValuesByValue(List<Integer> list) {
        Random random = new Random(); // для генерации значений
        long startTime = System.currentTimeMillis();// начальное время фиксируем
        for (int i = 0; i < DELETION_BY_VALUE; i++) { //цикл удалений
            int value = random.nextInt(10_001); // случ значение для удалений от 0 до 10000
            if (list.contains(value)) { //проверяем есть ли значение перед тем как удалить
                list.remove((Integer) value); // удаляем если значение есть
            }
        }
        return System.currentTimeMillis() - startTime; // время выполнения
    }


}
