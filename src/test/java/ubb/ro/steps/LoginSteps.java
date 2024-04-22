package ubb.ro.steps;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.annotations.findby.By;
import ubb.ro.pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class LoginSteps extends UIInteractionSteps {


   public void is_on_login_page(){

       try {
           Thread.sleep(3000);
       }catch (Exception e){
           e.getStackTrace();
       }
       find(LoginPage.LOGIN_BUTTON).click();
   }



    public void enters_username(String username){
       try {
        Thread.sleep(4000);
    }catch (Exception e){
        e.getStackTrace();
    }
        find(LoginPage.USERNAME_FIELD).sendKeys(username);
    }


    public void enters_password(String password){
       try {
        Thread.sleep(3000);
    }catch (Exception e){
        e.getStackTrace();
    }
        find(LoginPage.PASSWORD_FIELD).sendKeys(password);
    }


    public void logs_in(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.getStackTrace();
        }
        find(LoginPage.CONNECT_BUTTON).click();
    }

    @Step()
    public void user_logs_in(String username, String password){
       is_on_login_page();
       enters_username(username);
       enters_password(password);
       logs_in();
    }

    @Step()
    public void should_be_on_my_account_page(String expectedUrl) {
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getStackTrace();
        }
        assertEquals(expectedUrl, Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl());
    }

    @Step()
    public void should_see_the_error_message(String expectedError){
           try {
                Thread.sleep(3000);
            } catch (Exception e){
                e.getStackTrace();
            }

           String actualError = Serenity.getWebdriverManager().getCurrentDriver().findElement(By.cssSelector(".alert.alert-danger.warning")).getText();
           assertEquals(expectedError, actualError);
    }
}
