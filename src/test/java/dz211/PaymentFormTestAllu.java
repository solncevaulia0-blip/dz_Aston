package dz211;
import dz210.BaseTest;

import io.qameta.allure.*;
        import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Онлайн пополнение без комиссии")
@Feature("Окно платежного шлюза")
public class PaymentFormTestAllu extends BaseTest {

    @Test
    @DisplayName("Проверка корректности данных и элементов в iframe оплаты")
    @Description("Заполнение формы мобильной связи, переход в платежный шлюз и валидация реквизитов")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPaymentForm() {

        Allure.step("Заполнение формы для 'Услуги связи' и переход к оплате", () -> {
            mtsPage.selectMobileService();
            mtsPage.fillPaymentForm("297777777", "50", "test@test.com");
            mtsPage.clickContinue();
        });

        Allure.step("Переключение в iframe платежной системы", () -> {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                    By.cssSelector(".bepaid-iframe, iframe[src*='secure'], iframe[src*='bepaid']")
            ));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@src,'visa-system.svg')]")));
        });

        Allure.step("Проверка наличия логотипов платежных систем", () -> {
            assertTrue(driver.findElement(By.xpath("//img[contains(@src,'visa-system.svg')]")).isDisplayed());
            assertTrue(driver.findElement(By.xpath("//img[contains(@src,'mastercard-system.svg')]")).isDisplayed());
            assertTrue(driver.findElement(By.xpath("//img[contains(@src,'belkart-system.svg')]")).isDisplayed());
            assertTrue(driver.findElement(By.xpath("//img[contains(@src,'maestro-system.svg')]")).isDisplayed());
        });

        Allure.step("Проверка переданного номера телефона и суммы", () -> {
            String pageSource = driver.getPageSource();
            assertTrue(pageSource.contains("375297777777"), "Неверный номер телефона в окне оплаты");
            assertTrue(pageSource.contains("50.00 BYN"), "Неверная сумма или валюта");
        });

        Allure.step("Проверка подписей пустых полей банковской карты", () -> {
            String pageSource = driver.getPageSource();
            assertTrue(driver.findElement(By.id("cc-number")).isDisplayed());
            assertTrue(pageSource.contains("Срок действия"));
            assertTrue(pageSource.contains("CVC"));
            assertTrue(pageSource.contains("Имя и фамилия"));
        });

        Allure.step("Возврат к основному контенту страницы", () -> {
            driver.switchTo().defaultContent();
        });
    }
}