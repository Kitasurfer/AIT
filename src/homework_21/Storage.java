package homework_21;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*

 */
public class Storage extends Component {
    private int capacity;

    public Storage(String brand, String model, int capacity) {
        super(brand, model);  // Вызываем конструктор
        this.capacity = capacity;
    }



    @Override
    public String toString() {
        return "Storage [brand= " + getBrand() + ", model= " + getModel() + ", capacity= " + capacity + " GB]";
    }

}