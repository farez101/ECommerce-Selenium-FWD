package StepDefinitions;

import Pages.P09_shoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D09_shopopingCartStepDef {

    P09_shoppingCart shop = new P09_shoppingCart();

    @Then("confirm message appears")
    public void confirm_message_appears(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(shop.getAddSuccess().getText().contains("The product has been added to your"));
        soft.assertAll();
    }
    @And("user click on item apple macBook")
    public void user_click_on_item_apple_macBook(){
        shop.item_Apple_MacBook().click();
    }

    @And("user add item apple macBook to cart")
    public void user_add_item_apple_macBook_to_cart(){
        shop.Add_Apple_MacBook_cart().click();
    }

    @And("user click on item samsung laptop")
    public void user_click_on_item_samsung_laptop(){
        shop.item_Laptop_Samsung().click();
    }

    @And("user add item samsung laptop to cart")
    public void user_add_item_samsung_laptop_to_cart(){
        shop.Add_Laptop_Samsung_cart().click();
    }

}
