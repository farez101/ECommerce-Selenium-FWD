package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class P07_ColorFilter {

    public WebElement getFilterColorRed() {
        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }

    public WebElement hover_Apparel_select_shoes (){
        WebElement Apparel = Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Apparel).build().perform();

        WebElement shoesCategory = Hooks.driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
        actionProvider.moveToElement(shoesCategory).click().build().perform();
        return Apparel;
    }
    public List getResultOfProductSearch (){
        return Hooks.driver.findElements(By.cssSelector(("div[class=\"product-item\"]")));
    }
}
