package StepDefinitions;

import Pages.P11_compareListAdding;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class D11_compareListAddingStepDef {

    P11_compareListAdding compare = new P11_compareListAdding();

    @Then("confirm message comparelist appears")
    public void confirm_message_appears(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(compare.getAddSuccess().getText().contains("The product has been added to your"));
        soft.assertAll();
    }

    @And("user add item apple macBook to comparelist")
    public void user_add_item_apple_macBook_to_cart(){
        compare.Add_Apple_MacBook_comparelist().click();
    }

    @And("user add item samsung laptop to comparelist")
    public void user_add_item_samsung_laptop_to_cart(){
        compare.Add_Laptop_Samsung_comparelist().click();
    }
}
