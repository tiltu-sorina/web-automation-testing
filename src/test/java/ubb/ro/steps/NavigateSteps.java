package ubb.ro.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import ubb.ro.pages.HomePage;
import ubb.ro.pages.LoginPage;

public class NavigateSteps extends UIInteractionSteps {

    LoginPage loginPage;

    @Step("User opens login page")
    public void opens_the_web_page(){
        loginPage.open();
    }

    @Step
    public void is_on_home_page(){
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getStackTrace();
        }
        find(HomePage.HOME_PAGE_BUTTON).click();
    }

    @Step
    public void is_on_cart_page(){
        try {
            Thread.sleep(4000);
        }catch (Exception e){
            e.getStackTrace();
        }
        find(HomePage.CART_BUTTON).click();
        find(HomePage.SHOW_CART_BUTTON).click();
    }
}
