package ubb.ro.features.logout;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ubb.ro.steps.LoginSteps;
import ubb.ro.steps.LogoutSteps;
import ubb.ro.steps.NavigateSteps;

@RunWith(SerenityRunner.class)
public class LogoutStory extends UIInteractionSteps {
    @Managed(uniqueSession = true, driver= "firefox")
    public WebDriver webdriver;
    @Steps
    public LoginSteps login;

    @Steps
    public NavigateSteps navigate;

    @Steps
    public LogoutSteps logout;

    @Test
    public void clicking_logout_should_logout_user_successfully() {
        navigate.opens_the_web_page();
        login.user_logs_in("email", "password");
        logout.clicks_on_logout();
        logout.should_see_successful_logout_message("Ai ieşit din contul tău. Puteţi părăsi calculatorul în siguranţă.");
    }



}