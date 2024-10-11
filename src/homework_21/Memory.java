package homework_21;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*

 */
public class Memory extends Component {
    private int size;

    public Memory(String brand, String model, int size) {
        super(brand, model);  // Конструктор родительского класса
        this.size = size;
    }


    @Override
    public String toString() {
        return "Memory [brand= " + getBrand() + ", model= " + getModel() + ", size= " + size + " GB]";
    }
}