package StepDefinitions;

import Pages.P01_register;
import io.cucumber.java.en.*;
import org.testng.asserts.SoftAssert;
public class D01_registerStepDef {
    P01_register register = new P01_register();
@Given ("user go to register page")
public void user_go_to_register_page (){
register.registerLink().click();
}
 @When("user select gender type")
 public void user_select_gender_type (){
  register.getMaleButton().click();
 }

 @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
 public void  user_enter_first_second_name(String FName, String LName){
register.getFirstName().sendKeys(FName);
register.getLastName().sendKeys(LName);
 }
 @And ("user enter date of birth")
 public void user_enter_date_of_birth (){
register.getDay().selectByVisibleText("17");
register.getMonth().selectByVisibleText("May");
register.getYear().selectByVisibleText("1993");
 }
 @And ("^user enter email \"(.*)\" field$")
 public void  user_enter_mail_field(String email){
 register.getEmail().sendKeys(email);
}
 @And ("^user fills Password fields \"(.*)\" \"(.*)\"$")
 public void user_fills_password_field (String password, String confirmPassword){
register.getPassword().sendKeys(password);
register.getConfirmPassword().sendKeys(confirmPassword);
 }
 @And ("user clicks on register button")
 public void user_clicks_on_register_button (){
register.getRegisterBtn().click();
 }
 @Then("success message is displayed")
 public void  success_message_is_displayed(){
  SoftAssert soft = new SoftAssert();
  soft.assertTrue(register.getRegisterResult().isDisplayed());
  soft.assertEquals(register.getRegisterResult().getText(),"Your registration completed");
  soft.assertEquals(register.getRegisterResult().getCssValue("color"),"rgba(76, 177, 124, 1)");
//  System.out.println(register.getRegisterResult().getCssValue("color"));
  soft.assertAll();
 }

}
