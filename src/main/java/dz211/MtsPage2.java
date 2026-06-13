package dz211;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MtsPage2 {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public MtsPage2(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Все локаторы объявлены в одном месте и не дублируются в методах
    private final By cookieAccept = By.xpath("//button[contains(text(),'Принять')]");
    private final By phoneField = By.id("connection-phone");
    private final By internetField = By.id("internet-phone");
    private final By installmentField = By.id("score-instalment");
    private final By debtField = By.id("score-arrears");
    private final By sumField = By.cssSelector("input[placeholder='Сумма']");
    private final By emailField = By.cssSelector("input[placeholder='E-mail для отправки чека']");
    private final By continueButton = By.xpath("//*[@id='pay-connection']/button");
    private final By selectHeader = By.cssSelector(".select__header");

    public void acceptCookies() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(cookieAccept)).click();
        } catch (Exception ignored) {}
    }

    private void selectMenu(String text) {
        driver.findElement(selectHeader).click();
        WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[contains(text(),'" + text + "')]")
        ));

        // ЗДЕСЬ БЫЛА ОШИБКА: Строка полностью переписана вручную, без скрытых спецсимволов
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", option);

        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {}
    }

    public void selectMobileService() { selectMenu("Услуги связи"); }
    public void selectHomeInternet() { selectMenu("Домашний интернет"); }
    public void selectInstallment() { selectMenu("Рассрочка"); }
    public void selectDebt() { selectMenu("Задолженность"); }

    public String getMobilePlaceholder() { return driver.findElement(phoneField).getAttribute("placeholder"); }
    public String getInternetPlaceholder() { return driver.findElement(internetField).getAttribute("placeholder"); }
    public String getInstallmentPlaceholder() { return driver.findElement(installmentField).getAttribute("placeholder"); }
    public String getDebtPlaceholder() { return driver.findElement(debtField).getAttribute("placeholder"); }
    public String getSumPlaceholder() { return driver.findElement(sumField).getAttribute("placeholder"); }
    public String getEmailPlaceholder() { return driver.findElement(emailField).getAttribute("placeholder"); }

    public void fillPaymentForm(String phone, String sum, String email) {
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(sumField).sendKeys(sum);
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickContinue() {
        WebElement button = driver.findElement(continueButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
    }
}