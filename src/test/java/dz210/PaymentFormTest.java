package dz210;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentFormTest extends BaseTest {

    @Test
    public void checkPaymentForm() throws InterruptedException {

        mtsPage.fillPaymentForm();

        mtsPage.clickContinue();

        Thread.sleep(5000);

        driver.switchTo().frame(2);

        assertTrue(
                driver.findElement(
                        By.xpath("//img[contains(@src,'visa-system.svg')]")
                ).isDisplayed()
        );

        assertTrue(
                driver.findElement(
                        By.xpath("//img[contains(@src,'mastercard-system.svg')]")
                ).isDisplayed()
        );

        assertTrue(
                driver.findElement(
                        By.xpath("//img[contains(@src,'belkart-system.svg')]")
                ).isDisplayed()
        );

        assertTrue(
                driver.findElement(
                        By.xpath("//img[contains(@src,'maestro-system.svg')]")
                ).isDisplayed()
        );
        assertTrue(
                driver.getPageSource()
                        .contains("375297777777")
        );

        assertTrue(
                driver.findElement(
                        By.id("cc-number")
                ).isDisplayed()
        );

        assertTrue(
                driver.getPageSource()
                        .contains("Срок действия")
        );

        assertTrue(
                driver.getPageSource()
                        .contains("CVC")
        );
        assertTrue(
                driver.getPageSource()
                        .contains("50.00 BYN")
        );
        assertTrue(
                driver.getPageSource()
                        .contains("Имя и фамилия")
        );
    }
}