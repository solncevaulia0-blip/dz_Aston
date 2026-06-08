package dz27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @DisplayName("Факториал числа 5")
    @Test
    void factorialOfFive() {
        assertEquals(120,
                Factorial.calculateFactorial(5));

    }
    @DisplayName("Факториал числа 1")
    @Test

    void factorialOfOne() {
        assertEquals(1,
                Factorial.calculateFactorial(1));

    }
}