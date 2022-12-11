package StepDefinitions;

import Pages.P03_passwordReset;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class D03_PasswordResetStepDef {
    P03_passwordReset pass = new P03_passwordReset();
    @And("user press on Forget Password")
    public void user_press_on_Forget_Password() {
    pass.getForgetPasswordLink().click();
    }

    @And("user fill his email")
    public void user_fill_his_email(){
    pass.getEmailForPasswordReset().sendKeys("fares.ahmed102@gmail.com");
    }
    @And("user click on recover button")
    public void user_click_on_recover_button(){
    pass.getRecoverBtn().click();
    }
    @Then("message of instruction is displayed")
    public void message_of_instruction_is_displayed(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue( pass.getRecoverPasswordMessage().getText().contains("Email with instructions has been sent to you."));
        soft.assertAll();
    }
}
