package StepDefinitions;

import Pages.P04_search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P04_search search = new P04_search();
    @And("^user search for item \"(.*)\"$")
    public void user_search_for_item(String item){
        search.getSearchField().sendKeys(item);
            }
    @And("user press on search button")
    public void user_press_on_search_button(){
        search.getSearchButton().click();
    }
    @Then("user finds product search result")
    public void user_finds_product_search_result(){
        SoftAssert soft = new SoftAssert();
       int sizeResult = search.getResultOfProductSearch().size();
        System.out.println(sizeResult);
        soft.assertTrue(sizeResult>0);
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        soft.assertAll();
    }

@And("^user search for item SKU \"(.*)\"$")
    public void user_search_for_item_SKU (String SKU_Item){
    search.getSearchField().sendKeys(SKU_Item);
}
    @Then("user find SKU result")
    public void user_find_SKU_result(){

        int sizeResult = search.getResultOfProductSearch().size();
        System.out.println(sizeResult);
        Assert.assertTrue(sizeResult>0);
        ( (WebElement) search.getResultOfProductSearch().get(0)) .click();
        String currentSKU = Hooks.driver.findElement(By.xpath("//div[@class=\"sku\"]")).getText();
        Assert.assertTrue(currentSKU.contains("APPLE_CAM"));

    }
}
