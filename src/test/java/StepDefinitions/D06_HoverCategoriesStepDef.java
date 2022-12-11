package StepDefinitions;

import Pages.P06_HoverCategories;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D06_HoverCategoriesStepDef {
    P06_HoverCategories category = new P06_HoverCategories();
    @When("user hover on Electronics category Tab and select Cell phones")
    public void user_hover_on_Electronics_category_Tab_and_select_Cell_phones(){
    category.Electronic_Cellphones_Category();
    }
    @Then("Cell phones from Electronics is loaded")
    public void Cell_phones_from_Electronics_is_loaded(){
    Assert.assertTrue(Hooks.driver.getTitle().toLowerCase().contains("cell phones"));
    }
    @When("user select computer Category Tab")
    public void user_select_computer_Category_Tab(){

        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(category.Computer_Category()).click().build().perform();
    }

    @Then("computer Category tab is loaded")
    public void computer_Category_tab_is_loaded(){
        Assert.assertTrue(Hooks.driver.getTitle().toLowerCase().contains("computers"));
    }
}
