package dz211;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest2 {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected MtsPage2 mtsPage1;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(20)
        );

        driver.manage().window().maximize();

        driver.get("https://www.mts.by/");

        mtsPage1 = new MtsPage2(
                driver,
                wait
        );

        mtsPage1.acceptCookies();
    }

    @AfterEach
    public void tearDown() {

        driver.quit();
    }
}