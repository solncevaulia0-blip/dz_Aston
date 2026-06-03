
package dz27;


import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TriangleAreaTest {
    @Test(description = "Площадь 6 и 4")
    void areaTest() {
        assertEquals(
                12.0,
                TriangleArea.calculateArea(6, 4)
        );
    }
    @Test(description = "Площадь 10 и 5")
    void secondAreaTest() {
        assertEquals(
                25.0,
                TriangleArea.calculateArea(10, 5)
        );
    }
}
