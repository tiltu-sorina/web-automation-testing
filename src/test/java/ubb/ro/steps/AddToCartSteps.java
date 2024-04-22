package ubb.ro.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import ubb.ro.pages.CartPage;
import ubb.ro.pages.HomePage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class AddToCartSteps extends UIInteractionSteps {
    @Step
    public void adds_the_first_product_on_the_page_in_the_cart(){

        try {
            Thread.sleep(4000);
        }catch (Exception e){
            e.getStackTrace();
        }
        find(HomePage.ADD_TO_CART_BUTTON).click();
    }

    @Step
    public void checks_if_the_product_was_added(String expectedText) {
        try {
            Thread.sleep(6000);
        }catch (Exception e){
            e.getStackTrace();
        }

        List<String> actualResults = new ArrayList<>();

        for (WebElement productName: CartPage.PRODUCT_NAMES) {
            actualResults.add(productName.getText());
        }
        assertTrue(actualResults.contains(expectedText));

        }

    }

