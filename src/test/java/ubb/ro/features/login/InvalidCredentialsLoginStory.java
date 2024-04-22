package ubb.ro.features.login;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ubb.ro.steps.LoginSteps;
import ubb.ro.steps.NavigateSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src\\test\\resources\\features\\login\\login.csv")
public class InvalidCredentialsLoginStory {

    private String username, password, expectedMessage;

    @Managed(uniqueSession = true, driver= "firefox")
    public WebDriver webdriver;
    @Steps
    public LoginSteps login;

    @Steps
    public NavigateSteps navigate;

    @Test
    public void login_with_invalid_credentials_should_display_the_error_message() {
        navigate.opens_the_web_page();
        login.user_logs_in(username, password);
        login.should_see_the_error_message(expectedMessage);
    }

}
