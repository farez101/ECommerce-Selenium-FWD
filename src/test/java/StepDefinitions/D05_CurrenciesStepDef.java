package StepDefinitions;

import Pages.P05_Currencies;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D05_CurrenciesStepDef {

    P05_Currencies curr = new P05_Currencies();
    @Given("user go to home page")
    public void user_go_to_home_page(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("user switch to euro currency")
    public void user_switch_to_euro_currency(){
    Select menuCurr = new Select(curr.getCurrencyMenu());
        menuCurr.selectByVisibleText("Euro");
    }
    @Then("items price currency change to euro")
    public void items_price_currency_change_to_euro (){
        Assert.assertTrue(curr.getCurrencyMenu().getText().contains("Euro"));
        for (WebElement item: curr.getItems()){
            Assert.assertTrue(item.getText().contains("€"));
        }
    }
}
