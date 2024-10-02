package lesson_17;

public class TatApp {
    public static void main(String[] args) {
        Tat17 tat = new Tat17("Catty", 8, 5);

        // Cat17 cat2 = new Cat17();


        tat.sayMeow();

        System.out.println(tat.toString());



//        cat.age = -1000;

//        cat.weight = 1500; // Не доступны, так как помочены как private
//
//        cat.name = null;
//
//        cat.test();
        String name = tat.getName();
        System.out.println("name = " + name);
        System.out.println("Вес: " + tat.getWeight());

        System.out.println("Возраст: " + tat.getAge());

        tat.setAge(18);
        System.out.println("Текущий возраст: " + tat.getAge());

        tat.setName("Max");

        System.out.println(tat.toString());

        System.out.println(" =============== \n");
    }
}