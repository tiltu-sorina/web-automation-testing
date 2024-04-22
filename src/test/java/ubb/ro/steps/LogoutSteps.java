package ubb.ro.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import ubb.ro.pages.LogoutPage;
import ubb.ro.pages.LogoutResultPage;

import static org.junit.Assert.assertEquals;

public class LogoutSteps extends UIInteractionSteps {

    @Step
    public void clicks_on_logout(){
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getStackTrace();
        }

        find(LogoutPage.LOGOUT_BUTTON).click();

    }

    @Step
    public void should_see_successful_logout_message(String expectedLogoutMessage){
        String actualLogoutMessage = find(LogoutResultPage.LOGOUT_MESSAGE).getText();
        assertEquals(expectedLogoutMessage, actualLogoutMessage);
    }
}
