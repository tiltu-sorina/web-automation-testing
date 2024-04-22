package ubb.ro.features.shopping;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ubb.ro.steps.AddToCartSteps;
import ubb.ro.steps.LoginSteps;
import ubb.ro.steps.NavigateSteps;

@RunWith(SerenityRunner.class)
public class AddToCartStory {
    @Managed(uniqueSession = true, driver= "firefox")
    public WebDriver webdriver;
    @Steps
    public LoginSteps login;

    @Steps
    public NavigateSteps navigate;

    @Steps
    public AddToCartSteps addToCart;


    @Test
    public void adding_first_product_on_the_page_to_cart_should_be_found_in_the_cart(){
        navigate.opens_the_web_page();
        login.user_logs_in("email", "password");
        navigate.is_on_home_page();
        addToCart.adds_the_first_product_on_the_page_in_the_cart();
        navigate.is_on_cart_page();
        addToCart.checks_if_the_product_was_added("Parfum Tester de barbati Christian Dior Sauvage 100 ml");
    }

}
