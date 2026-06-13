package dz210;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlaceholdersTest extends BaseTest {

    @Test
    public void checkAllPlaceholders() {

        String pageSource =
                driver.getPageSource();

        assertTrue(
                pageSource.contains("Номер телефона")
        );

        assertTrue(
                pageSource.contains("Номер абонента")
        );

        assertTrue(
                pageSource.contains("Номер счета на 44")
        );

        assertTrue(
                pageSource.contains("Номер счета на 2073")
        );
    }
}