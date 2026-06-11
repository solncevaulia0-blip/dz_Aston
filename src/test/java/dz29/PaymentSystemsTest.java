package dz29;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentSystemsTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    void setUp() {

        driver = new ChromeDriver();

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(20)
        );

        driver.manage().window().maximize();

        driver.get("https://www.mts.by/");
    }
try {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        MtsPage.COOKIE_ACCEPT
                )
        ).click();

    } catch (Exception e) {

    }
    @AfterEach
    void tearDown() {

        driver.quit();
    }

    @Test
    void checkPaymentSystemsLogos() {

        assertTrue(
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                MtsPage.VISA_LOGO
                        )
                ).isDisplayed()
        );

        assertTrue(
                driver.findElement(
                        MtsPage.VERIFIED_BY_VISA_LOGO
                ).isDisplayed()
        );

        assertTrue(
                driver.findElement(
                        MtsPage.MASTERCARD_LOGO
                ).isDisplayed()
        );

        assertTrue(
                driver.findElement(
                        MtsPage.MASTERCARD_SECURECODE_LOGO
                ).isDisplayed()
        );

        assertTrue(
                driver.findElement(
                        MtsPage.BELKART_LOGO
                ).isDisplayed()
        );
    }
}
