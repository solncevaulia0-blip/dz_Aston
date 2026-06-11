package dz29;

import org.openqa.selenium.By;

public class MtsPage {

    public static final By TITLE =
            By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2");

    public static final By VISA_LOGO =
            By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[1]/img");

    public static final By VERIFIED_BY_VISA_LOGO =
            By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[2]/img");

    public static final By MASTERCARD_LOGO =
            By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[3]/img");

    public static final By MASTERCARD_SECURECODE_LOGO =
            By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[4]/img");

    public static final By BELKART_LOGO =
            By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[5]/img");

    public static final By DETAILS_LINK =
            By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a");

    public static final By PHONE_FIELD =
            By.xpath("//*[@id='connection-phone']");

    public static final By SUM_FIELD =
            By.xpath("//*[@id='connection-sum']");

    public static final By EMAIL_FIELD =
            By.xpath("//*[@id='connection-email']");

    public static final By CONTINUE_BUTTON =
            By.xpath("//*[@id='pay-connection']/button");

    public static final By PAYMENT_PAGE_TITLE =
            By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span");

    public static final By COOKIE_ACCEPT =
            By.xpath("//*[@id='cookie-agree']");

}

