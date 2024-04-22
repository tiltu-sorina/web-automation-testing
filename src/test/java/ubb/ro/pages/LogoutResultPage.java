package ubb.ro.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutResultPage extends PageObject {

    public static final By LOGOUT_MESSAGE = By.xpath("//*[@id=\"content\"]/p[1]");
}
