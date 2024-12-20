package lesson_25;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 16-10-2024
*/

/*

 */
// Способен работать с любым типом данных
public class GenericBox <T>{
    private T value;

    public GenericBox(T value){
            this.value = value;
    }
        public T getValue(){
        return value;
        }

    public  void setValue(T value){
        this.value = value;
    }
    @Override
    public String toString() {
        return "GenericBox{" +
                "value= " + value +
                '}';
    }

}
