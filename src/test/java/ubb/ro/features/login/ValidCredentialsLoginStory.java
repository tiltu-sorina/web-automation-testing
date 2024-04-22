package ubb.ro.features.login;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ubb.ro.steps.LoginSteps;
import ubb.ro.steps.NavigateSteps;

@RunWith(SerenityRunner.class)
public class ValidCredentialsLoginStory {

    @Managed(uniqueSession = true, driver= "firefox")
    public WebDriver webdriver;
    @Steps
    public LoginSteps login;

    @Steps
    public NavigateSteps navigate;


    @Test
    public void login_with_valid_credentials_should_get_user_on_my_account_page() {
        navigate.opens_the_web_page();
        login.user_logs_in("email", "password");
        login.should_be_on_my_account_page("https://www.parfumuritestere.eu/index.php?route=account/account");
    }
}
