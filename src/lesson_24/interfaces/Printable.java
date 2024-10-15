package lesson_24.interfaces;


// Интерфэйс косвенно абстрактны. Нам не нужно писать ключевое слово abstract оно присутствует
// по молчанию на этапе компиляции
public interface Printable {
    // Интерфейс - это совокупность абстрактных методов задающих поведение

    public abstract

    void print();

    default void test() {
        System.out.println("Test");
    }

    static void testStatic(String str) {
        System.out.println("Static Test" + str);
    }


}
