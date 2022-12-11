package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_Currencies {
    public WebElement getCurrencyMenu(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> getItems(){
        return Hooks.driver.findElements(By.cssSelector(("span[class=\"price actual-price\"]")));
    }
}
