package ubb.ro.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ubb.ro.steps.LoginSteps;
import ubb.ro.steps.NavigateSteps;
import ubb.ro.steps.SearchProductSteps;

@RunWith(SerenityRunner.class)
public class SearchProductStory {

    @Managed(uniqueSession = true, driver= "firefox")
    public WebDriver webdriver;
    @Steps
    public LoginSteps login;

    @Steps
    public NavigateSteps navigate;

    @Steps
    public SearchProductSteps search;

    @Test
    public void search_should_display_all_products_that_contains_the_search_term_in_the_product_name() {
        navigate.opens_the_web_page();
        login.user_logs_in("email", "password");
        search.enters_keyword("alien");
        search.starts_the_search();
        search.should_see_the_results_that_contains_search_term_in_the_title("alien");

    }

}
