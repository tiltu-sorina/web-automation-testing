package ubb.ro.pages;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SecondSearchResultPage extends PageObject {
    public static final List<WebElement> PRODUCT_NAMES = Serenity.getWebdriverManager().getCurrentDriver().findElements(By.xpath("//h4[@class='name']/a"));

}
