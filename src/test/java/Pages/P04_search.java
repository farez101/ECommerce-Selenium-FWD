package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_search {
    public WebElement getSearchField (){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement getSearchButton (){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public List getResultOfProductSearch (){
        return Hooks.driver.findElements(By.cssSelector(("div[class=\"product-item\"]")));
    }
}
