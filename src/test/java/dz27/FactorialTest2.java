package dz27;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FactorialTest2 {
    @Test(description = "Факториал числа 5")
    void factorialOfFive() {
        assertEquals(120,
                Factorial.calculateFactorial(5));

    }
    @Test(description = "Факториал числа 1")

    void factorialOfOne() {
        assertEquals(1,
                Factorial.calculateFactorial(1));

    }
}