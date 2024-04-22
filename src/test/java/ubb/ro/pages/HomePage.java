package ubb.ro.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final By HOME_PAGE_BUTTON = By.xpath("//*[@id=\"main-menu-item-1\"]/a");
    public static final By ADD_TO_CART_BUTTON = By.xpath("//a[@onclick=\"addToCart('363');\"]");
    public static final By CART_BUTTON = By.cssSelector("button.btn.btn-inverse.btn-block.btn-lg.dropdown-toggle.heading");
    public static final By SHOW_CART_BUTTON = By.xpath("//*[@id=\"cart\"]/div/ul/li[2]/div/p/a[1]");
    public static final By SEARCH_BAR = By.name("search");

    public static final By SEARCH_BUTTON = By.className("button-search");

}
