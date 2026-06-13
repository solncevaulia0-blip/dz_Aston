package dz211;

import dz210.BaseTest;
import io.qameta.allure.*;
        import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Онлайн пополнение без комиссии")
@Feature("Проверка плейсхолдеров")
public class PlaceholdersAlluTest extends BaseTest2 {

    @Test
    @DisplayName("Проверка надписей в незаполненных полях для всех вариантов оплаты")
    @Description("Тест проверяет корректность атрибутов placeholder для полей ввода на всех вкладках оплаты")
    @Severity(SeverityLevel.TRIVIAL)
    public void checkAllPlaceholders() {

        Allure.step("Проверка вкладки «Услуги связи»", () -> {
            mtsPage1.selectMobileService();
            assertEquals("Номер телефона", mtsPage1.getMobilePlaceholder());
            assertEquals("Сумма", mtsPage1.getSumPlaceholder());
            assertEquals("E-mail для отправки чека", mtsPage1.getEmailPlaceholder());
        });

        Allure.step("Проверка вкладки «Домашний интернет»", () -> {
            mtsPage1.selectHomeInternet();
            assertEquals("Номер абонента", mtsPage1.getInternetPlaceholder());
            assertEquals("Сумма", mtsPage1.getSumPlaceholder());
            assertEquals("E-mail для отправки чека", mtsPage1.getEmailPlaceholder());
        });

        Allure.step("Проверка вкладки «Рассрочка»", () -> {
            mtsPage1.selectInstallment();
            assertEquals("Номер счета на 44", mtsPage1.getInstallmentPlaceholder());
            assertEquals("Сумма", mtsPage1.getSumPlaceholder());
            assertEquals("E-mail для отправки чека", mtsPage1.getEmailPlaceholder());
        });

        Allure.step("Проверка вкладки «Задолженность»", () -> {
            mtsPage1.selectDebt();
            assertEquals("Номер счета на 2073", mtsPage1.getDebtPlaceholder());
            assertEquals("Сумма", mtsPage1.getSumPlaceholder());
            assertEquals("E-mail для отправки чека", mtsPage1.getEmailPlaceholder());
        });
    }
}