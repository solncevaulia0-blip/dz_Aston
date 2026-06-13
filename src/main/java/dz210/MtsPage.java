package dz210;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MtsPage {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Actions actions;

    public MtsPage(
            WebDriver driver,
            WebDriverWait wait
    ) {
        this.driver = driver;
        this.wait = wait;
        this.actions = new Actions(driver);
    }

    private final By cookieAccept =
            By.xpath("//button[contains(text(),'Принять')]");

    private final By phoneField =
            By.id("connection-phone");

    private final By sumField =
            By.id("connection-sum");

    private final By emailField =
            By.id("connection-email");

    private final By continueButton =
            By.xpath("//*[@id='pay-connection']/button");

    public void acceptCookies() {

        try {

            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            cookieAccept
                    )
            ).click();

        } catch (Exception ignored) {

        }
    }

    public void selectMobileService() {

        Select select =
                new Select(
                        driver.findElement(
                                By.id("pay")
                        )
                );

        select.selectByVisibleText(
                "Услуги связи"
        );
    }

    public void selectHomeInternet() {

        Select select =
                new Select(
                        driver.findElement(
                                By.id("pay")
                        )
                );

        select.selectByVisibleText(
                "Домашний интернет"
        );
    }

    public void selectInstallment() {

        Select select =
                new Select(
                        driver.findElement(
                                By.id("pay")
                        )
                );

        select.selectByVisibleText(
                "Рассрочка"
        );
    }

    public void selectDebt() {

        Select select =
                new Select(
                        driver.findElement(
                                By.id("pay")
                        )
                );

        select.selectByVisibleText(
                "Задолженность"
        );
    }

    public String getPlaceholder() {

        System.out.println(driver.getPageSource());

        return "";
    }

    public void fillPaymentForm() {

        driver.findElement(
                phoneField
        ).sendKeys("297777777");

        driver.findElement(
                sumField
        ).sendKeys("50");

        driver.findElement(
                emailField
        ).sendKeys("test@test.com");
    }

    public void clickContinue() {

        WebElement button =
                driver.findElement(
                        continueButton
                );

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].click();",
                button
        );
    }
}