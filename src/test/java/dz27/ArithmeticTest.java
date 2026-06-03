package dz27;


import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class ArithmeticTest {
    @Test(description = "Сложение")
    void addTest() {
        assertEquals(
                8,
                Arithmetic.add(5, 3)
        );
    }
    @Test(description = "Вычитание")
    void subtractTest() {
        assertEquals(
                2,
                Arithmetic.subtract(5, 3)
        );
    }
    @Test(description = "Умножение")
    void multiplyTest() {
        assertEquals(
                15,
                Arithmetic.multiply(5, 3)
        );
    }

    @Test(description = "Деление")
    void divideTest() {
        assertEquals(
                2,
                Arithmetic.divide(6, 3)
        );
    }
    @Test(description = ("Деление на ноль"))
    void divideByZeroTest() {
        assertThrows(
                ArithmeticException.class,
                () -> Arithmetic.divide(5,0)
        );
    }
}


