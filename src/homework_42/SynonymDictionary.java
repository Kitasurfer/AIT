package homework_42;

/**
 * Group: 52-1, "AIT Hi-tech team" GMBH
 * Author: Bogdan Fesenko
 * Date: 10-11-2024
 */
/**
 * Task 3 Опционально
 * Словарь синонимов
 * Реализуйте простой словарь синонимов, где каждому слову соответствует список его синонимов.
 * <p>
 * Инструкции:
 * Используйте HashMap<String, List> для хранения слов и их синонимов.
 * Реализуйте функции для добавления синонимов к слову и получения списка синонимов для заданного слова.
 * Предусмотрите возможность обновления и удаления синонимов.
 * Создать класс SynonymDictionary, который будет содержать HashMap<String, List> для хранения данных.
 * Реализовать методы:
 * addSynonym(String word, String synonym) — добавляет синоним к слову.
 * getSynonyms(String word) — возвращает список синонимов для заданного слова.
 * updateSynonyms(String word, List synonyms) — обновляет список синонимов для слова.
 * removeSynonym(String word, String synonym) — удаляет синоним из списка синонимов слова.
 * removeWord(String word) — удаляет слово и все его синонимы из словаря.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс SynonymDictionary представляет словарь синонимов, где каждому слову соответствует список его синонимов.
 * Данный класс предоставляет методы для работы со словарем, включая добавление, получение, обновление и удаление синонимов.
 *
 * Методы:
 * - addSynonym(String word, String synonym) — добавляет синоним к слову.
 * - getSynonyms(String word) — возвращает список синонимов для заданного слова.
 * - updateSynonyms(String word, List<String> synonyms) — обновляет список синонимов для слова.
 * - removeSynonym(String word, String synonym) — удаляет синоним из списка синонимов слова.
 * - removeWord(String word) — удаляет слово и все его синонимы из словаря.
 */

public class SynonymDictionary {


    private final Map<String, List<String>> synonymMap;

    public SynonymDictionary() {
        synonymMap = new HashMap<>();
    }

    // Метод для добавления синонима к слову
    public void addSynonym(String word, String synonym) {
        // Если слово еще нет в словаре, добавляем его с пустым списком синонимов
        synonymMap.putIfAbsent(word, new ArrayList<>());
        // Добавляем синоним к списку
        synonymMap.get(word).add(synonym);
        System.out.println(STR."Добавлен синоним: \"\{synonym}\" к слову: \"\{word}\". ");
    }

    // получение списка синонимов слова
    public List<String> getSynonyms(String word) {
        // Возвращаем список синонимов или пустой список, если слова нет в словаре
        return synonymMap.getOrDefault(word, new ArrayList<>());

    }

    // обновление списка синонимов слова
    public void updateSynonyms(String word, List<String> synonyms) {
        if (synonymMap.containsKey(word)) {
            synonymMap.put(word, new ArrayList<>(synonyms));
            System.out.println(STR."Список синонимов для слова \"\{word}\" обновлен.");
        } else {
            System.out.println(STR."Слово \"\{word}\" не найдено.");

        }


    }

    // удаление конкретного синонима слова
    public void removeSynonym(String word, String synonym) {
        List<String> synonyms = synonymMap.get(word);
        if (synonyms != null && synonyms.remove(synonym)) {
            System.out.println(STR."Синоним \"\{synonym}\" удален из списка слова \"\{word}\". ");
        } else {
            System.out.println(STR."Синоним \"\{synonym}\" не найден у слова \"\{word}\". ");
        }
    }

    // удаление слова и всех его синонимов из словаря
    public void removeWord(String word) {
        if (synonymMap.remove(word) != null) {
            System.out.println("Слово \" " + word + "\" и все его синонимы удалены. ");
        } else {
            System.out.println(" Слово \" " + word + "\" не найдено. ");
        }


    }

    public static void main(String[] args) {


        // Создаем словарь синонимов
        SynonymDictionary dictionary = new SynonymDictionary();
        dictionary.addSynonym("быстрый", "скорый");
        dictionary.addSynonym("быстрый", "проворный");
        dictionary.addSynonym("умный", "сообразительный");
        dictionary.addSynonym("умный", "разумный");
        dictionary.addSynonym("красивый", "привлекательный");
        dictionary.addSynonym("красивый", "прекрасный");

        // Получаем и выводим синонимы
        System.out.println("Синонимы для слова \"быстрый\": " + dictionary.getSynonyms("быстрый"));
        System.out.println("Синонимы для слова \"умный\": " + dictionary.getSynonyms("умный"));
        System.out.println("Синонимы для слова \"красивый\": " + dictionary.getSynonyms("красивый"));
        System.out.println("Синонимы для слова \"красивый\": " + dictionary.getSynonyms("красивый"));
        // Обновляем список синонимов
        List<String> newSynonyms = List.of("оперативный", "торопливый");
        dictionary.updateSynonyms("быстрый", newSynonyms);
        System.out.println("Новый список синонимов для слова \"быстрый\": " + dictionary.getSynonyms("быстрый"));
        // Удаляем синоним
        dictionary.removeSynonym("быстрый", "оперативный");
        System.out.println("Синонимы после удаления: " + dictionary.getSynonyms("быстрый"));
        // Удаляем слово
        dictionary.removeWord("быстрый");
    }


}
