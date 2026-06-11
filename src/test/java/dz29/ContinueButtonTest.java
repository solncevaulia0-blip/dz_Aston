package dz29;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContinueButtonTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    void setUp() {

        driver = new ChromeDriver();

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(30)
        );

        driver.manage().window().maximize();

        driver.get("https://www.mts.by/");

        try {

            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            MtsPage.COOKIE_ACCEPT
                    )
            ).click();

        } catch (Exception e) {

        }
    }

    @AfterEach
    void tearDown() {

        driver.quit();
    }

    @Test
    void checkContinueButton() {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        MtsPage.PHONE_FIELD
                )
        ).sendKeys("297777777");

        driver.findElement(
                MtsPage.SUM_FIELD
        ).sendKeys("50");

        driver.findElement(
                MtsPage.EMAIL_FIELD
        ).sendKeys("test@test.com");

        WebElement button =
                driver.findElement(
                        MtsPage.CONTINUE_BUTTON
                );

        assertTrue(
                button.isEnabled()
        );

        button.click();
    }
}