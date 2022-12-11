package StepDefinitions;

import Pages.P09_shoppingCart;
import Pages.P10_wishlistAdding;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class D10_wishlistAddingStepDef {

    P10_wishlistAdding wish = new P10_wishlistAdding();

    @Then("confirm message wishlist appears")
    public void confirm_message_appears(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(wish.getAddSuccess().getText().contains("The product has been added to your"));
        soft.assertAll();
    }

    @And("user add item apple macBook to wishlist")
    public void user_add_item_apple_macBook_to_cart(){
        wish.Add_Apple_MacBook_wishlist().click();
    }

    @And("user add item samsung laptop to wishlist")
    public void user_add_item_samsung_laptop_to_cart(){
        wish.Add_Laptop_Samsung_wishlist().click();
    }
}
