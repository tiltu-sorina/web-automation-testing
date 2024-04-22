package ubb.ro.steps;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import ubb.ro.pages.HomePage;
import ubb.ro.pages.FirstSearchResultPage;
import ubb.ro.pages.SecondSearchResultPage;

import static org.junit.Assert.assertTrue;

public class SearchProductSteps extends UIInteractionSteps {
    @Step
    public void enters_keyword(String keyword){
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getStackTrace();
        }
        find(HomePage.SEARCH_BAR).sendKeys(keyword);
    }

    @Step
    public void starts_the_search() {
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getStackTrace();
        }
        find(HomePage.SEARCH_BUTTON).click();
    }

    @Step
    public void should_see_the_results_that_contains_search_term_in_the_title(String searchTerm) {
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getStackTrace();
        }
        find(FirstSearchResultPage.DESCRIPTION_SEARCH_CHECKBOX).click();
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getStackTrace();
        }
        find(FirstSearchResultPage.SECONDARY_SEARCH_BUTTON).click();
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getStackTrace();
        }

        for (WebElement name : SecondSearchResultPage.PRODUCT_NAMES) {
            assertTrue(name.getText().toLowerCase().contains(searchTerm));
        }
    }

}
