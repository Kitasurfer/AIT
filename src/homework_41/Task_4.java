package homework_41;

import java.util.*;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 07-11-2024
 */
/*
Task 4
Опционально
Построение маршрута.
У вас есть карта прямых рейсов, где ключ — это название города отправления, а значение — город назначения.
Необходимо написать функцию, которая принимает карту рейсов, город отправления и город назначения и возвращает
список городов, через которые проходит маршрут. Если прямого рейса нет, функция должна пытаться найти маршрут
с пересадками.

Условия:

Если прямого рейса нет, нужно искать возможные пересадки через другие города.
Если маршрут невозможно составить, функция должна возвращать пустой список.
Предполагается, что нет циклических маршрутов, и из города можно уехать только в один другой город
(один к одному соответствие).
 */
public class Task_4 {
    public static void main(String[] args) {
        Map<String, String> directFlights = new HashMap<>();
        directFlights.put("New York", "Chicago");
        directFlights.put("Chicago", "Denver");
        directFlights.put("Denver", "Las Vegas");
        directFlights.put("Boston", "Miami");
        directFlights.put("Miami", "New York");
        directFlights.put("Los Angeles", "San Francisco");
        directFlights.put("San Francisco", "New York");


        printRoute(directFlights,"Boston", "Las Vegas");        // Маршрут с пересадками
        printRoute(directFlights,"Los Angeles", "New York");     // Маршрут с пересадками
        printRoute(directFlights,"Boston", "New York");          // Маршрут с пересадками
        printRoute(directFlights,"Los Angeles", "San Francisco");// Прямой маршрут
        printRoute(directFlights,"Miami", "Chicago");            // Маршрут с пересадками
        printRoute(directFlights,"Boston", "San Francisco");      // Маршрут отсутствует

    }

    public static void printRoute( Map<String, String> directFlights, String start, String destination) {
        List<String> route = findRoute(directFlights, start, destination);

        if (route.isEmpty()) {
            System.out.println(Color.RED + "No route found from " + start + " to " + destination + Color.RESET);
        } else if (route.size() == 2) {
            System.out.println(Color.BLUE + "Direct flight: " + route + Color.RESET);
        } else {
            System.out.println(Color.YELLOW + "Route with connections: " + route + Color.RESET);
        }
    }

    public static List<String> findRoute(Map<String, String> directFlights, String start, String destination) {
        Map<String, List<String>> graph = new HashMap<>();
        directFlights.forEach((k, v) -> graph.computeIfAbsent(k, x -> new ArrayList<>()).add(v));

        Queue<List<String>> queue = new LinkedList<>();
        queue.add(Collections.singletonList(start));

        while (!queue.isEmpty()) {
            List<String> path = queue.poll();
            String lastCity = path.get(path.size() - 1);

            if (lastCity.equals(destination)) return path;

            graph.getOrDefault(lastCity, Collections.emptyList()).stream()
                    .filter(next -> !path.contains(next))
                    .forEach(next -> {
                        List<String> newPath = new ArrayList<>(path);
                        newPath.add(next);
                        queue.add(newPath);
                    });
        }

        return Collections.emptyList();
    }
}
