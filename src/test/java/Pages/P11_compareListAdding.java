package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P11_compareListAdding {


    public WebElement item_Apple_MacBook() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }

    public WebElement Add_Apple_MacBook_comparelist() {
        return Hooks.driver.findElement(By.cssSelector("div div[class=\"compare-products\"]"));
    }


    public WebElement item_Laptop_Samsung() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]"));
    }

    public WebElement Add_Laptop_Samsung_comparelist() {
        return Hooks.driver.findElement(By.cssSelector("div div[class=\"compare-products\"]"));
    }
    public WebElement getAddSuccess(){
        return  Hooks.driver.findElement(By.className("content"));
    }
}
