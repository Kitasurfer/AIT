package HomeWork_18;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 08-10-2024
*/

/*

 */
public class Dog {
    private String name;
    private int highJump;
    private int count = 0;

    public Dog(String name, int highJump) {
        this.name = name;
        this.highJump = highJump;
    }

    public void getJump() {
        System.out.println("Прыгаем");
        count++;
    }

    public void getTrain(){
        System.out.println("Тренируемся");
        if (this.highJump * 2 < 10) {
            this.highJump += 10;
        }
    }

    public void jumpBarrier(int highBarrier) {
        if (highJump > highBarrier) {
            getJump();
        } else {
            if (this.highJump * 2 > highBarrier) {
                getTrain();
                getJump();
            } else {
                System.out.println("Не можем взять барьер");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighJump() {
        return highJump;
    }

    public void setHighJump(int highJump) {
        this.highJump = highJump;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Dick", 5);
        dog.jumpBarrier(15);
    }
}