package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductionOfNumbersTest {
    ProductionOfNumbers productionOfNumbers = new ProductionOfNumbers();

    @Test
    void getRange() {
        long test1=productionOfNumbers.getRange(0,1l);
        Assertions.assertEquals(0 ,test1);

        long test2 = productionOfNumbers.getRange(2L, 2L);
        Assertions.assertEquals(2L, test2);

        long test3 = productionOfNumbers.getRange(1L, 4L);
        Assertions.assertEquals(24L, test3);

        long test4 = productionOfNumbers.getRange(5L, 15L);
        Assertions.assertEquals(54486432000L, test4);

    }
}
