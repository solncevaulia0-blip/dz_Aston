package dz210;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaceholdersTest extends BaseTest {

    @Test
    public void checkAllPlaceholders() {
        // 1. Проверка вкладки «Услуги связи»
        mtsPage.selectMobileService();
        assertEquals("Номер телефона", mtsPage.getMobilePlaceholder());
        assertEquals("Сумма", mtsPage.getSumPlaceholder());
        assertEquals("E-mail для отправки чека", mtsPage.getEmailPlaceholder());

        // 2. Проверка вкладки «Домашний интернет»
        mtsPage.selectHomeInternet();
        assertEquals("Номер абонента", mtsPage.getInternetPlaceholder());
        assertEquals("Сумма", mtsPage.getSumPlaceholder());
        assertEquals("E-mail для отправки чека", mtsPage.getEmailPlaceholder());

        // 3. Проверка вкладки «Рассрочка»
        mtsPage.selectInstallment();
        assertEquals("Номер счета на 44", mtsPage.getInstallmentPlaceholder());
        assertEquals("Сумма", mtsPage.getSumPlaceholder());
        assertEquals("E-mail для отправки чека", mtsPage.getEmailPlaceholder());

        // 4. Проверка вкладки «Задолженность»
        mtsPage.selectDebt();
        assertEquals("Номер счета на 2073", mtsPage.getDebtPlaceholder());
        assertEquals("Сумма", mtsPage.getSumPlaceholder());
        assertEquals("E-mail для отправки чека", mtsPage.getEmailPlaceholder());
    }
}