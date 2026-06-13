package dz210;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentFormTest extends BaseTest {

    @Test
    public void checkPaymentForm() {
        // Переходим на вкладку мобильной связи и заполняем форму
        mtsPage.selectMobileService();
        mtsPage.fillPaymentForm("297777777", "50", "test@test.com");
        mtsPage.clickContinue();

        //  Ждем, пока iframe оплаты появится в DOM и переключаемся в него.
        // На сайте МТС используется фрейм от bePaid (обычно содержит в имени/классе 'bepaid-iframe' или 'iframe')
        // Используем универсальный селектор для поиска фрейма платежной системы:
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".bepaid-iframe, iframe[src*='secure'], iframe[src*='bepaid']")));

        // Ждем, пока иконки платежных систем станут видимыми внутри фрейма
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'visa-system.svg')]")));

        // Проверяем наличие иконок
        assertTrue(driver.findElement(By.xpath("//img[contains(@src,'visa-system.svg')]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//img[contains(@src,'mastercard-system.svg')]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//img[contains(@src,'belkart-system.svg')]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//img[contains(@src,'maestro-system.svg')]")).isDisplayed());

        // Проверяем текстовые данные внутри фрейма
        String pageSource = driver.getPageSource();
        assertTrue(pageSource.contains("375297777777"), "Неверный номер телефона в окне оплаты");
        assertTrue(pageSource.contains("50.00 BYN"), "Неверная сумма или валюта");

        // Проверяем поля для ввода карты
        assertTrue(driver.findElement(By.id("cc-number")).isDisplayed());
        assertTrue(pageSource.contains("Срок действия"));
        assertTrue(pageSource.contains("CVC"));
        assertTrue(pageSource.contains("Имя и фамилия"));

        // После окончания проверок возвращаемся из фрейма на основную страницу
        driver.switchTo().defaultContent();
    }
}