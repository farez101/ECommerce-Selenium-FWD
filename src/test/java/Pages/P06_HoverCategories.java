package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P06_HoverCategories {
    public WebElement Computer_Category() {
        WebElement Computer_Category = Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
        return Computer_Category;
    }

    public WebElement Electronic_Cellphones_Category() {
        WebElement Electronic_Category = Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(Electronic_Category).build().perform();

        By CameraSubCategory = By.cssSelector("a[href=\"/cell-phones\"]");
        WebElement Camera_photo_SubCategory = Hooks.driver.findElement(CameraSubCategory);
        actionProvider.moveToElement(Camera_photo_SubCategory).click().build().perform();
        return Electronic_Category;
    }
}
