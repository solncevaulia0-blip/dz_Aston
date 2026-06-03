
package dz27;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleAreaTest {
@DisplayName("Площадь 6 и 4")
    @Test
    void areaTest() {
        assertEquals(
                12.0,
                TriangleArea.calculateArea(6, 4)
        );
    }
    @DisplayName("Площадь 10 и 5")
    @Test
    void secondAreaTest() {
        assertEquals(
                25.0,
                TriangleArea.calculateArea(10, 5)
        );
    }
}
