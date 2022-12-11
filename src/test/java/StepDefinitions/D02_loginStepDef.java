package StepDefinitions;

import Pages.P02_login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();

    @Given("user go to login page")
    public void user_go_to_login_page(){
        login.getLoginURL().click();
            }
    @When("^user login with \"valid\" \"(.*)\" and \"(.*)\"$")
    public void user_login_with_Valid_Logins(String user,String password){
        login.getLoginEMail().sendKeys(user);
        login.getLoginPassword().sendKeys(password);
    }
    @When("^user login with \"invalid\" \"(.*)\" and \"(.*)\"$")
    public void user_login_with_Invalid_Logins(String user,String password){
        login.getLoginEMail().sendKeys(user);
        login.getLoginPassword().sendKeys(password);
    }
    @And("user press on login button")
    public void user_press_on_login_button(){
        login.getLoginBtn().click();
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully (){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.getMyAccountTab().isDisplayed());
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertAll();
    }
    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system(){
        SoftAssert soft = new SoftAssert();
        String failMessageColor = Color.fromString(login.getLoginFail().getCssValue("color")).asHex();
        soft.assertTrue(login.getLoginFail().getText().contains("Login was unsuccessful."));
        soft.assertEquals(failMessageColor,"#e4434b");
        soft.assertAll();
    }
}
