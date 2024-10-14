package homework_23.task_2;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 14-10-2024
*/

/*

 */
public class GameCharacterApp {
    public static void main(String[] args) {

        GameCharacter[] gameCharacters = {
                new Warrior("Воин Варя"),
                new Mage("Воин Мага"),
                new Archer("Воин Арчер")
        };

        for (GameCharacter gc : gameCharacters) {
            gc.attack();
        }

    }

}
