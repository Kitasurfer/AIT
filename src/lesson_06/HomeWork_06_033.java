/*
Task 4
Дан следующий код. Вашей задачей является предсказать,
какой вывод будет напечатан в консоли после выполнения программы.
*/

public class HomeWork_06_033 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10; // 8+3=11>10 true
        System.out.println("Result 1: " + result);

        result = (a - b) == 5; // 8-3=5==5 true
        System.out.println("Result 2: " + result);

        result = (a * b) != 24; // 8*3=24 !=24 false
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2; // 8/3=2>=2 true
        System.out.println("Result 4: " + result);

        result = !(a % b == 2); // 8%3=!(2 == 2) !true false так как ! оператор, результат станет false
        System.out.println("Result 5: " + result);
    }
}

