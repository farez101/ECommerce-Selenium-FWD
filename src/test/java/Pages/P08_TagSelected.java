package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_TagSelected {
    public WebElement getTagCool() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/cool\"]"));
    }
    public WebElement getTagGame() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/game\"]"));
    }



}
