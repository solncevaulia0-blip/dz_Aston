package dz27;


import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CompareNumbersTest2 {
    @Test(description = "Первое больше")
    void firstNumberIsBigger() {

        assertEquals(
                "Первое больше",
                CompareNumbers.compare(10, 5)
        );
    }
    @Test(description = "Второе больше")
    void secondNumberIsBigger() {
        assertEquals(
                "Второе больше",
                CompareNumbers.compare(5, 10)
        );
    }
    @Test(description = "Равны")
    void numbersAreEqual() {
        assertEquals(
                "Числа равны",
                CompareNumbers.compare(5, 5)
        );
    }
}
