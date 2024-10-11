package homework_21;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*

 */
public class Processor extends Component {
    private double clockSpeed;

    public Processor(String brand, String model, double clockSpeed) {
        super(brand, model);
        this.clockSpeed = clockSpeed;
    }



    @Override
    public String toString() {
        return "Processor [brand=" + getBrand() + ", model=" + getModel() + ", clockSpeed=" + clockSpeed + " GHz]";
    }
}
