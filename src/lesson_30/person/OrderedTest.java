package lesson_30.person;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 23-10-2024
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*

 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    @Test
    @Order(5)
    void firstTest() {
        System.out.println("First test");
    }

    @Test
    @Order(2)
    void secondTest() {
        System.out.println("Second test");
    }

    @Test
    @Order(3)
    void thirdTest() {
        System.out.println("Third test");
    }
}
