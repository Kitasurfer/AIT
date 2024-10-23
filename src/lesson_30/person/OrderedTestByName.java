package lesson_30.person;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 23-10-2024
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*

 */

@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderedTestByName {

    @Test
    void testB(){
        System.out.println("TestB");
    }

    @Test
    void testA(){
        System.out.println("TestA");
    }

    @Test
    void testC(){
        System.out.println("TestC");
    }


}
