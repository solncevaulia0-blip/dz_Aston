package dz27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticTest {
@DisplayName("Сложение")
    @Test
    void addTest() {
        assertEquals(
                8,
                Arithmetic.add(5, 3)
        );
    }
    @DisplayName("Вычитание")
    @Test
    void subtractTest() {
        assertEquals(
                2,
                Arithmetic.subtract(5, 3)
        );
    }
    @DisplayName("Умножение")
    @Test
    void multiplyTest() {
        assertEquals(
                15,
                Arithmetic.multiply(5, 3)
        );
    }
    @DisplayName("Деление")
    @Test
    void divideTest() {
        assertEquals(
                2,
                Arithmetic.divide(6, 3)
        );
    }
    @Test
    @DisplayName("Деление на ноль")
    void divideByZeroTest() {
        assertThrows(
                ArithmeticException.class,
                () -> Arithmetic.divide(5,0)
        );
    }
}


