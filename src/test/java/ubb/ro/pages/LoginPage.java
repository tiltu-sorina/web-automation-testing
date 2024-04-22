package ubb.ro.pages;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.parfumuritestere.eu/")

public class LoginPage extends PageObject {
    public static final By LOGIN_BUTTON = By.cssSelector("a.m-item[href=\"https://www.parfumuritestere.eu/index.php?route=account/login\"]");
    public static final By USERNAME_FIELD = By.id("input-email");
    public static final By PASSWORD_FIELD = By.id("input-password");
    public static final By CONNECT_BUTTON = By.cssSelector("input[type=\"submit\"].btn.btn-primary.button");


}
