package ubb.ro.pages;


import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends PageObject {

    public static final By PRODUCT_NAME = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");
    public static final List<WebElement> PRODUCT_NAMES = Serenity.getWebdriverManager().getCurrentDriver().findElements(By.cssSelector(".text-left.name a"));





}
