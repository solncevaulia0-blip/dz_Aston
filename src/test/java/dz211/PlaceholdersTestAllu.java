package dz211;

import dz210.BaseTest;
import io.qameta.allure.*;
        import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Онлайн пополнение без комиссии")
@Feature("Проверка плейсхолдеров")
public class PlaceholdersTestAllu extends BaseTest {

    @Test
    @DisplayName("Проверка надписей в незаполненных полях для всех вариантов оплаты")
    @Description("Тест проверяет корректность атрибутов placeholder для полей ввода на всех вкладках оплаты")
    @Severity(SeverityLevel.TRIVIAL)
    public void checkAllPlaceholders() {

        Allure.step("Проверка вкладки «Услуги связи»", () -> {
            mtsPage.selectMobileService();
            assertEquals("Номер телефона", mtsPage.getMobilePlaceholder());
            assertEquals("Сумма", mtsPage.getSumPlaceholder());
            assertEquals("E-mail для отправки чека", mtsPage.getEmailPlaceholder());
        });

        Allure.step("Проверка вкладки «Домашний интернет»", () -> {
            mtsPage.selectHomeInternet();
            assertEquals("Номер абонента", mtsPage.getInternetPlaceholder());
            assertEquals("Сумма", mtsPage.getSumPlaceholder());
            assertEquals("E-mail для отправки чека", mtsPage.getEmailPlaceholder());
        });

        Allure.step("Проверка вкладки «Рассрочка»", () -> {
            mtsPage.selectInstallment();
            assertEquals("Номер счета на 44", mtsPage.getInstallmentPlaceholder());
            assertEquals("Сумма", mtsPage.getSumPlaceholder());
            assertEquals("E-mail для отправки чека", mtsPage.getEmailPlaceholder());
        });

        Allure.step("Проверка вкладки «Задолженность»", () -> {
            mtsPage.selectDebt();
            assertEquals("Номер счета на 2073", mtsPage.getDebtPlaceholder());
            assertEquals("Сумма", mtsPage.getSumPlaceholder());
            assertEquals("E-mail для отправки чека", mtsPage.getEmailPlaceholder());
        });
    }
}