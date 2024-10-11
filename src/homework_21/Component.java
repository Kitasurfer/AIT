package homework_21;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 11-10-2024
*/

/*

 */
public class Component {

        private String brand;
        private String model;

        public Component(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Component [brand=" + brand + ", model=" + model + "]";
        }
    }