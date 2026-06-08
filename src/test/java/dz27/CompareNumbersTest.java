package dz27;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareNumbersTest {
@DisplayName("Первое больше")
    @Test
    void firstNumberIsBigger() {

        assertEquals(
                "Первое больше",
                CompareNumbers.compare(10, 5)
        );
    }
    @DisplayName("Второе больше")
    @Test
    void secondNumberIsBigger() {
        assertEquals(
                "Второе больше",
                CompareNumbers.compare(5, 10)
        );
    }
    @DisplayName("Равны")
    @Test
    void numbersAreEqual() {
        assertEquals(
                "Числа равны",
                CompareNumbers.compare(5, 5)
        );
    }
}
