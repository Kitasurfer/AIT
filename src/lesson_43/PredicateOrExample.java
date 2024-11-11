import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateOrExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(8, 15, 16, 3, 25, 5);
        List<Integer> result = filter(numbers, num -> num % 2 == 0 || num > 15);

        System.out.println("Числа, которые либо четные, либо больше 15: " + result); // Вывод: [8, 15, 16, 25]
    }

    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : list) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
