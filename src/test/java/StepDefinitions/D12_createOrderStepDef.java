package StepDefinitions;

import Pages.P12_createOrder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class D12_createOrderStepDef {
    P12_createOrder order = new P12_createOrder();


        @When("user press on Shopping cart")
    public void user_press_on_Shopping_cart(){
        order.getShoppingCart().click();
        }
    @Then("shopping cart page loads")
    public void shopping_cart_page_loads(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("cart"));
        soft.assertAll();
    }
    @When("user check accept box to agree terms")
    public void user_check_accept_box_to_agree_terms(){
            order.getAgreementCheckbox().click();
    }
    @And("user click checkout button")
        public void user_click_checkout_button(){
            order.getCheckoutBtn().click();
    }

    @Then ("checkout page loads")
    public void checkout_page_loads(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("opc-billing"));
        soft.assertAll();
    }
    @When ("user update billing address")
    public void user_update_billing_address(){
            order.getCountry().selectByVisibleText("Egypt");
            order.getCity().sendKeys("Giza");
            order.getAddress1().sendKeys("Pyramids Garden");
            order.getZipCode().sendKeys("52952");
            order.getPhone().sendKeys("01097319806");
    }
    @And ("user press billing address continue button")
    public void user_press_billing_address_continue_button(){
       order.getBillingAddressContinueBtn().click();
    }
    @And ("user selected delivery method and pressed continue")
    public void user_selected_delivery_method_and_pressed_continue(){
       order.getDeliveryMethodContinueBtn().click();
    }
    @And ("user selected payment method and pressed continue")
    public void user_selected_payment_method_and_pressed_continue(){
        order.getPaymentMethodContinueBtn().click();
    }
    @And ("user pressed payment information continue button")
    public void user_pressed_payment_information_continue_button(){
      order.getPaymentInformationContinueBtn().click();
    }
    @And ("user pressed confirm continue button")
    public void user_pressed_confirm_continue_button() throws InterruptedException {
        order.getConfirmButton().click();
        Thread.sleep(2000);

    }
    @Then ("message of successful order appear")
    public void message_of_successful_order_appear(){

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("completed"));
        System.out.println(order.getMessageOfOrder().getText());
        soft.assertTrue(order.getMessageOfOrder().getText().contains("Your order has been successfully processed!"));
        soft.assertAll();

    }

}
